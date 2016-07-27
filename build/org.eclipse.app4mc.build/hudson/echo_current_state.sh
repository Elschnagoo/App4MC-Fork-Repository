#!/bin/bash
echo 'Starting echo_current_state...'

commit_id=$(git rev-parse HEAD)
echo 'Commit id is: '$commit_id

all_tags=$(git tag --contains $commit_id)
echo 'All tags: '$all_tags


tag_name=''
for TAG in $(git tag --contains $commit_id)
do
	if [[ $TAG == milestone* ]] || [[ $TAG == release* ]] ; then
		tag_name=$TAG
	fi
done


if [ ${#tag_name} -gt 0 ]; then
	echo 'TAG FOUND: '$tag_name
else
	echo 'NO RELEVANT TAG FOUND.'
fi

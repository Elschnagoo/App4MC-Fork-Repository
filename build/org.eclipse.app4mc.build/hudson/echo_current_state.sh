#!/bin/bash
echo 'Starting echo_current_state...'

# --- For offline test ---
#COMMIT_ID='aebeb85fdf911e4dbbc90c4d243251908f04f683'

echo '---------------------------------------------------------------------'
echo 'Parameter COMMIT_ID: '$COMMIT_ID
echo '---------------------------------------------------------------------'

if [ ${#COMMIT_ID} -gt 0 ]; then
	commit_id=$COMMIT_ID
else
	commit_id=$(git rev-parse HEAD)
fi
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

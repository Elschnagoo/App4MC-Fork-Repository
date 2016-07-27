#!/bin/bash
echo 'Starting copy_release...'

script_dir=$(dirname $0)
absolute=$(readlink -f $script_dir)
release_build_folder=$absolute/../../org.eclipse.app4mc.platform.product/target/products
p2_build_folder=$absolute/../../org.eclipse.app4mc.p2repo/target

download_folder='/home/data/httpd/download.eclipse.org/app4mc'
product_folder=$download_folder/products
updatesite_folder=$download_folder/updatesites

if [ ${#COMMIT_ID} -gt 0 ]; then
	commit_id=$COMMIT_ID
else
	commit_id=$(git rev-parse HEAD)
fi
echo 'Commit id is: '$commit_id

tag_name=''
for TAG in $(git tag --contains $commit_id)
do
	if [[ $TAG == milestone* ]] || [[ $TAG == release* ]] ; then
		tag_name=$TAG
	fi
done
echo 'Tag name is: '$tag_name

# Only copy to download area if tag is set in current commit
if [ ${#tag_name} -gt 0 ]; then
  echo 'Creating product folder for tag '$tag_name
  mkdir -p $product_folder/$tag_name
  cp -v $release_build_folder/org.eclipse.app4mc.*.zip "$product_folder/$tag_name"
  cp -v $p2_build_folder/org.eclipse.app4mc.p2repo-*-SNAPSHOT-*.zip "$product_folder/$tag_name"
  echo 'Removing SNAPSHOT in names...'
  for file in "$product_folder/$tag_name"/*.zip; do
    mv -v "$file" "${file/-SNAPSHOT/}"
  done
  echo 'Creating updatesites folder for tag '$tag_name
  mkdir -p $updatesite_folder/$tag_name
  unzip $p2_build_folder/org.eclipse.app4mc.p2repo-*-SNAPSHOT-*.zip -d $updatesite_folder/$tag_name
fi

#!/bin/bash
echo 'Starting copy_release...'
script_dir=$(dirname $0)
absolute=$(readlink -f $script_dir)
release_build_folder=$absolute/../../org.eclipse.app4mc.platform.product/target/products
p2_build_folder=$absolute/../../org.eclipse.app4mc.p2repo/target
download_folder='/home/data/httpd/download.eclipse.org/app4mc'
commit_id=$(git rev-parse HEAD)
echo 'Commit id is: '$commit_id
tag_name=$(git describe --tags $commit_id)
echo 'Tag name is: '$tag_name
# Only copy to download area if tag is set in current commit
if [ ${#tag_name} -gt 0 ]; then
  echo 'Creating folder for tag '$tag_name
  mkdir $download_folder/$tag_name
  cp -v $release_build_folder/org.eclipse.app4mc.*.zip "$download_folder/$tag_name"
  cp -v $p2_build_folder/org.eclipse.app4mc.p2repo*.zip "$download_folder/$tag_name"
fi

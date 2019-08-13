#!/bin/bash
script_dir=$(dirname $0)
folder_libs=$script_dir/../../../dev_env_lib/help_docu

echo $script_dir
echo $folder_libs

ls /opt/tools/

ls /opt/tools/mylyn-wikitext/

mkdir -p $folder_libs
cp -v /opt/tools/mylyn-wikitext/2.9.0.v20160513-1433/*.jar $folder_libs

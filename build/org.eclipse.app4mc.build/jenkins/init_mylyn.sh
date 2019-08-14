#!/bin/bash
script_dir=$(dirname $0)
folder_libs=$script_dir/../../../dev_env_lib/help_docu

mkdir -p $folder_libs
cp -v /opt/tools/mylyn-wikitext/2.9.0.v20160513-1433/*.jar $folder_libs

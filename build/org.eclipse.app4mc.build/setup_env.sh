#!/bin/bash
echo 'Starting setup...'
script_dir=$(dirname $0)
folder_libs=$script_dir/../../dev_env_lib
folder_help_lib=$folder_libs/help_docu
url_wikitext=http://build.eclipse.org/common/mylyn-wikitext/2.9.0.v20160513-1433/

if [ ! -d $folder_help_lib ]; then
  echo 'Creating folders for docu libs...'
  mkdir -p $folder_help_lib
else
  echo 'Cleaning folder for docu lib...'
  rm -v $folder_help_lib/*.jar
fi

echo 'Downloading mylyn standalone...'
wget --no-parent --accept jar -e robots=off -r -l 1 -nd -P $folder_help_lib $url_wikitext

echo 'Finished!'

#!/bin/bash
echo 'Starting cleanup download area...'

download_folder='/home/data/httpd/download.eclipse.org/app4mc'
product_folder=$download_folder/products
updatesite_folder=$download_folder/updatesites

if [ ${#DOWNLOAD_NAME} -gt 0 ] && [[ "$DOWNLOAD_NAME" != *".."* ]]; then
	echo 'Deleting folder download.eclipse.org/app4mc/products/'$DOWNLOAD_NAME
	if [ -d "$product_folder/$DOWNLOAD_NAME" ]; then
		rm -rf "$product_folder/$DOWNLOAD_NAME"
	fi
	
	echo 'Deleting folder download.eclipse.org/app4mc/updatesites/'$DOWNLOAD_NAME
	if [ -d "$updatesite_folder/$DOWNLOAD_NAME" ]; then
		rm -rf "$updatesite_folder/$DOWNLOAD_NAME"
	fi
else
	echo 'Invalid name. No cleanup.'
fi

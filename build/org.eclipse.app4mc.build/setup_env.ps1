Write-Output 'Starting setup...'

$folder_lib="..\..\dev_env_lib"
$folder_help_lib="$folder_lib\help_docu"
$url_wikitext="http://build.eclipse.org/common/mylyn-wikitext/2.9.0.v20160513-1433"

If (!(Test-Path $folder_help_lib)) {
 
	Write-Host "Creating dir $folder_help_lib"
	New-Item -Path $folder_help_lib -ItemType Directory
 
}
else {
	Write-Host "Deleting existing jars..."
	remove-item $folder_help_lib\* -include *.jar
}

Write-Output 'Downloading Mylyn Wikitext standalone...'

$client = New-Object System.Net.WebClient

#Proxy settings if needed
#$proxy = New-Object System.Net.WebProxy("http://<proxy host>:<proxy port>",$true)
#$client.Proxy=$proxy
#$client.proxy.Credentials = New-Object System.Net.NetworkCredential("user", "password")

$client.DownloadFile("$url_wikitext/com.google.guava_15.0.0.v201403281430.jar", "$folder_help_lib\com.google.guava_15.0.0.v201403281430.jar")
$client.DownloadFile("$url_wikitext/org.eclipse.mylyn.wikitext.asciidoc.core_2.9.0.v20160524-1633.jar", "$folder_help_lib\org.eclipse.mylyn.wikitext.asciidoc.core_2.9.0.v20160524-1633.jar")
$client.DownloadFile("$url_wikitext/org.eclipse.mylyn.wikitext.confluence.core_2.9.0.v20160513-1433.jar", "$folder_help_lib\org.eclipse.mylyn.wikitext.confluence.core_2.9.0.v20160513-1433.jar")
$client.DownloadFile("$url_wikitext/org.eclipse.mylyn.wikitext.core.ant_2.9.0.v20160513-1433.jar", "$folder_help_lib\org.eclipse.mylyn.wikitext.core.ant_2.9.0.v20160513-1433.jar")
$client.DownloadFile("$url_wikitext/org.eclipse.mylyn.wikitext.core.osgi_2.9.0.v20160513-1433.jar", "$folder_help_lib\org.eclipse.mylyn.wikitext.core.osgi_2.9.0.v20160513-1433.jar")
$client.DownloadFile("$url_wikitext/org.eclipse.mylyn.wikitext.core_2.9.0.v20160513-1433.jar", "$folder_help_lib\org.eclipse.mylyn.wikitext.core_2.9.0.v20160513-1433.jar")
$client.DownloadFile("$url_wikitext/org.eclipse.mylyn.wikitext.html.core_2.9.0.v20160513-1433.jar", "$folder_help_lib\org.eclipse.mylyn.wikitext.html.core_2.9.0.v20160513-1433.jar")
$client.DownloadFile("$url_wikitext/org.eclipse.mylyn.wikitext.markdown.core_2.9.0.v20160513-1433.jar", "$folder_help_lib\org.eclipse.mylyn.wikitext.markdown.core_2.9.0.v20160513-1433.jar")
$client.DownloadFile("$url_wikitext/org.eclipse.mylyn.wikitext.mediawiki.core.ant_2.9.0.v20160513-1433.jar", "$folder_help_lib\org.eclipse.mylyn.wikitext.mediawiki.core.ant_2.9.0.v20160513-1433.jar")
$client.DownloadFile("$url_wikitext/org.eclipse.mylyn.wikitext.mediawiki.core_2.9.0.v20160513-1433.jar", "$folder_help_lib\org.eclipse.mylyn.wikitext.mediawiki.core_2.9.0.v20160513-1433.jar")
$client.DownloadFile("$url_wikitext/org.eclipse.mylyn.wikitext.textile.core_2.9.0.v20160513-1433.jar", "$folder_help_lib\org.eclipse.mylyn.wikitext.textile.core_2.9.0.v20160513-1433.jar")
$client.DownloadFile("$url_wikitext/org.eclipse.mylyn.wikitext.tracwiki.core_2.9.0.v20160513-1433.jar", "$folder_help_lib\org.eclipse.mylyn.wikitext.tracwiki.core_2.9.0.v20160513-1433.jar")
$client.DownloadFile("$url_wikitext/org.eclipse.mylyn.wikitext.twiki.core_2.9.0.v20160519-0832.jar", "$folder_help_lib\org.eclipse.mylyn.wikitext.twiki.core_2.9.0.v20160519-0832.jar")

Write-Host "Finished!"
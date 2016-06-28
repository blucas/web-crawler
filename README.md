# Web Crawler Project

Web Crawler is a standard Maven based project which crawls a given website. 

## How to build

This is a standard Maven project, so just run `mvn clean install` and the project will be compiled and the tests will run.

You require the following to build the project:

* [Oracle JDK 8](http://www.oracle.com/technetwork/java/)
* [Apache Maven](http://maven.apache.org/)

JDK 8 is required to build and run this project.

## Running the Project

From the project base directory you can run `mvn exec:java -Dexec.args="<some website here>"`. The crawler will begin crawling the website starting at the given url.

### Trade Offs

As this is just an example project, no consideration was taken regarding:

 * Performance of the crawler (such as fetching multiple pages concurrently)
 * Load on the webserver (there is no wait time between page fetches)
 * Advanced exception handling (for example if the page fetched is not an html document)

#### Operation Examples

The following example demonstrates running the crawler against `http://blog.shakatechnologies.com`

```
$ mvn exec:java -Dexec.args="http://blog.shakatechnologies.com"
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building web-crawler 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- exec-maven-plugin:1.5.0:java (default-cli) @ web-crawler ---
Visiting: http://blog.shakatechnologies.com
Visiting: http://blog.shakatechnologies.com/2013/06/ishlangu-14-released-web-acceleration.html
Visiting: http://blog.shakatechnologies.com/
Visiting: http://blog.shakatechnologies.com/2012/12/speed-counts.html
Visiting: http://blog.shakatechnologies.com/search/label/Application%20Delivery%20Controller
Visiting: http://blog.shakatechnologies.com/2013/04/ishlangu-13-is-out-download-today.html
Visiting: http://blog.shakatechnologies.com/search/label/Access%20Control
Visiting: http://blog.shakatechnologies.com/2013/05/securely-publishing-web-apps-in-post.html
Visiting: http://blog.shakatechnologies.com/search/label/Active%20Directory
Visiting: http://blog.shakatechnologies.com/search/label/Exchange%20CAS%20Publishing
Visiting: http://blog.shakatechnologies.com/search/label/NTLM
Visiting: http://blog.shakatechnologies.com/search/label/SharePoint%20Publishing
Visiting: http://blog.shakatechnologies.com/search/label/Single%20Sign%20On
Visiting: http://blog.shakatechnologies.com/search/label/SSO
Visiting: http://blog.shakatechnologies.com/search/label/TMG
Visiting: http://blog.shakatechnologies.com/search/label/UAG
Visiting: http://blog.shakatechnologies.com/search/label/Web%20Application%20Firewall
Visiting: http://blog.shakatechnologies.com/search/label/Web%20Application%20Security
Visiting: http://blog.shakatechnologies.com/search/label/Auditing
Visiting: http://blog.shakatechnologies.com/search/label/Ishlangu
Visiting: http://blog.shakatechnologies.com/2013/06/ishlangu-14-released-web-acceleration.html#comment-form
Visiting: http://blog.shakatechnologies.com/search/label/load%20time
Visiting: http://blog.shakatechnologies.com/search/label/page%20speed
Visiting: http://blog.shakatechnologies.com/search/label/Release%20Announcement
Visiting: http://blog.shakatechnologies.com/search/label/resource%20optimization
Visiting: http://blog.shakatechnologies.com/search/label/uControl%20Script
Visiting: http://blog.shakatechnologies.com/search/label/WCO
Visiting: http://blog.shakatechnologies.com/search/label/Web%20Acceleration
Visiting: http://blog.shakatechnologies.com/search/label/Web%20Optimization
Visiting: http://blog.shakatechnologies.com/search/label/WRO
Visiting: http://blog.shakatechnologies.com/search/label/WRO?updated-max=2013-06-03T18:04:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/feeds/posts/default
Visiting: http://blog.shakatechnologies.com/search?updated-min=2013-01-01T00:00:00Z&updated-max=2014-01-01T00:00:00Z&max-results=4
Visiting: http://blog.shakatechnologies.com/search/label/LDAP
Visiting: http://blog.shakatechnologies.com/search/label/LDAP?updated-max=2013-04-23T16:38:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/2013_06_01_archive.html
Visiting: http://blog.shakatechnologies.com/search?updated-max=2013-06-03T18:04:00%2B01:00&max-results=7
Visiting: http://blog.shakatechnologies.com/2013/02/ishlangu-12-is-here.html
Visiting: http://blog.shakatechnologies.com/feeds/14248172749080226/comments/default
Visiting: http://blog.shakatechnologies.com/2013_05_01_archive.html
Visiting: http://blog.shakatechnologies.com/search?updated-max=2013-05-01T13:30:00%2B01:00&max-results=7
Visiting: http://blog.shakatechnologies.com/2013/02/ishlangu-12-is-here.html#comment-form
Visiting: http://blog.shakatechnologies.com/2013_04_01_archive.html
Visiting: http://blog.shakatechnologies.com/search?updated-max=2013-04-23T16:38:00%2B01:00&max-results=7
Visiting: http://blog.shakatechnologies.com/2012/12/speed-counts.html#comment-form
Visiting: http://blog.shakatechnologies.com/search/label/Content%20Rewriting
Visiting: http://blog.shakatechnologies.com/search/label/High%20Availability
Visiting: http://blog.shakatechnologies.com/search/label/Response%20Processing
Visiting: http://blog.shakatechnologies.com/search/label/SPDY
Visiting: http://blog.shakatechnologies.com/search/label/Speedy
Visiting: http://blog.shakatechnologies.com/2012/12/ishlangu-11-released-geo-ip-and-spdy.html
Visiting: http://blog.shakatechnologies.com/search/label/geo-ip
Visiting: http://blog.shakatechnologies.com/2012/12/ishlangu-11-released-geo-ip-and-spdy.html#comment-form
Visiting: http://blog.shakatechnologies.com/search/label/Geolocation
Visiting: http://blog.shakatechnologies.com/search/label/Geolocation?updated-max=2012-12-17T10:47:00Z&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/2013_02_01_archive.html
Visiting: http://blog.shakatechnologies.com/search?updated-max=2013-02-27T10:56:00Z&max-results=7
Visiting: http://blog.shakatechnologies.com/2012/11/website-code-injection-and-how-it.html
Visiting: http://blog.shakatechnologies.com/search/label/Code%20Injection
Visiting: http://blog.shakatechnologies.com/2012/11/website-code-injection-and-how-it.html#comment-form
Visiting: http://blog.shakatechnologies.com/search/label/Content%20Manipulation
Visiting: http://blog.shakatechnologies.com/2012/11/ishlangu-ultimate-control-with-ucontrol.html
Visiting: http://blog.shakatechnologies.com/search/label/Ishlangu%20Video%20Tutorials
Visiting: http://blog.shakatechnologies.com/2012/11/ishlangu-ultimate-control-with-ucontrol.html#comment-form
Visiting: http://blog.shakatechnologies.com/2012/11/introducing-ishlangu.html
Visiting: http://blog.shakatechnologies.com/feeds/1835358602520109861/comments/default
Visiting: http://blog.shakatechnologies.com/search?updated-min=2012-01-01T00:00:00Z&updated-max=2013-01-01T00:00:00Z&max-results=5
Visiting: http://blog.shakatechnologies.com/2012/11/introducing-ishlangu.html#comment-form
Visiting: http://blog.shakatechnologies.com/2012_12_01_archive.html
Visiting: http://blog.shakatechnologies.com/search?updated-max=2012-12-17T10:47:00Z&max-results=7
Visiting: http://blog.shakatechnologies.com/2012_11_01_archive.html
Visiting: http://blog.shakatechnologies.com/feeds/8441927337666222799/comments/default
Visiting: http://blog.shakatechnologies.com/search/label/Ishlangu%20Video%20Tutorials?updated-max=2012-11-02T13:05:00Z&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/Content%20Manipulation?updated-max=2012-11-02T13:05:00Z&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/feeds/5858787094937915923/comments/default
Visiting: http://blog.shakatechnologies.com/search/label/Code%20Injection?updated-max=2012-11-30T16:36:00Z&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/feeds/494673256396563138/comments/default
Visiting: http://blog.shakatechnologies.com/search/label/geo-ip?updated-max=2012-12-17T10:47:00Z&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/Speedy?updated-max=2012-12-17T10:47:00Z&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/SPDY?updated-max=2012-12-17T10:47:00Z&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/Response%20Processing?updated-max=2012-11-02T13:05:00Z&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/Content%20Rewriting?updated-max=2012-11-02T13:05:00Z&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/feeds/5104993487956986661/comments/default
Visiting: http://blog.shakatechnologies.com/search?updated-max=2012-11-02T13:05:00Z&max-results=7&start=7&by-date=false
Visiting: http://blog.shakatechnologies.com/search?updated-max=2013-06-03T18:04:00%2B01:00&max-results=7&reverse-paginate=true
Visiting: http://blog.shakatechnologies.com/search?updated-max=2012-11-02T13:05:00Z&max-results=7&reverse-paginate=true&start=7&by-date=false
Visiting: http://blog.shakatechnologies.com/search?updated-min=2012-12-31T16:00:00-08:00&updated-max=2013-02-27T10:56:00Z&max-results=4&start=4&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/Web%20Optimization?updated-max=2013-06-03T18:04:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/Web%20Acceleration?updated-max=2013-06-03T18:04:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/WCO?updated-max=2013-06-03T18:04:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/uControl%20Script?updated-max=2012-11-02T13:05:00Z&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/resource%20optimization?updated-max=2013-06-03T18:04:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/Release%20Announcement?updated-max=2012-12-17T10:47:00Z&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/page%20speed?updated-max=2012-12-17T10:47:00Z&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/load%20time?updated-max=2013-06-03T18:04:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/feeds/2110002104691610985/comments/default
Visiting: http://blog.shakatechnologies.com/search/label/Auditing?updated-max=2013-04-23T16:38:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/UAG?updated-max=2013-05-01T13:30:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/TMG?updated-max=2013-05-01T13:30:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/SSO?updated-max=2013-04-23T16:38:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/Single%20Sign%20On?updated-max=2013-04-23T16:38:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/SharePoint%20Publishing?updated-max=2013-05-01T13:30:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/NTLM?updated-max=2013-05-01T13:30:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/Exchange%20CAS%20Publishing?updated-max=2013-05-01T13:30:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/Active%20Directory?updated-max=2013-04-23T16:38:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search/label/Access%20Control?updated-max=2013-04-23T16:38:00%2B01:00&max-results=20&start=20&by-date=false
Visiting: http://blog.shakatechnologies.com/search?updated-max=2012-11-30T16:36:00Z&max-results=7

Media: (44)
 * img: <http://2.bp.blogspot.com/-6UhrPXfDse8/UaxlmAW_cnI/AAAAAAAAAD4/C4jYZSBqU9w/s1600/vm.png>
 * img: <http://1.bp.blogspot.com/-5WGQxkk5z2U/UaxlmM0Z1gI/AAAAAAAAAD8/-VusfTiJsBI/s1600/dns.png>
 * img: <http://3.bp.blogspot.com/-8tv_vN20_BE/UaxlpFoKxOI/AAAAAAAAAEI/QXhmxq6EZPk/s1600/speedtest.png>
 * img: <https://resources.blogblog.com/img/icon18_edit_allbkg.gif>
 * img: <http://1.bp.blogspot.com/-yQANffK68Dg/UYDm0Hx9GhI/AAAAAAAAACU/u92rG8v0Xqo/s400/Screen+Shot+2013-05-01+at+10.56.09.png>
 * img: <http://1.bp.blogspot.com/-AoMef_gbHVM/UYDuaR3n-VI/AAAAAAAAACk/uzni4ZqnPRw/s400/Screen+Shot+2013-05-01+at+11.05.16.png>
 * embed: <http://www.youtube.com/v/vaXAS09V0XQ?version=3&f=user_uploads&c=google-webdrive-0&app=youtube_gdata>
 * img: <http://1.bp.blogspot.com/-ptunc6wRZeA/UXZxzKD5IdI/AAAAAAAAAC8/vRlSmNaXYSU/s1600/directory.png>
 * img: <http://4.bp.blogspot.com/-pgzsaF951oc/UXZxzpnEeqI/AAAAAAAAADM/QKQczj8Fvfo/s320/event_log.png>
 * img: <http://4.bp.blogspot.com/-40IqAs3zpLk/UXaKmY-KJ4I/AAAAAAAAADg/VO9LIjdKUVc/s320/application-lock-icon.png>
 * img: <http://4.bp.blogspot.com/-c7re4UIr0bI/UXZxzM3lNcI/AAAAAAAAADI/HrI0l8mR9ys/s320/audit_log.png>
 * img: <http://2.bp.blogspot.com/-yRXbxEBlk5U/UXZxzjmQYaI/AAAAAAAAADQ/_rhZ8lvG6Rk/s320/sso.png>
 * img: <http://4.bp.blogspot.com/-vYUFHXQ1zFY/UTDv264MKoI/AAAAAAAAACQ/HKjAxvZL1AE/s1600/cache.png>
 * img: <http://3.bp.blogspot.com/-J9O3sYQ0uQw/UTDv24G2V9I/AAAAAAAAACM/q2NWlI8n9AQ/s1600/activitymonitor.png>
 * img: <http://2.bp.blogspot.com/-9ixLpYFZZCE/UTDv2iApogI/AAAAAAAAACI/djuSb-W0YDI/s1600/email.png>
 * img: <http://3.bp.blogspot.com/-rbhIPen_eKg/UTDv3KKI53I/AAAAAAAAACU/XbMjuYcJMsw/s1600/hazard.png>
 * img: <http://1.bp.blogspot.com/-2Fk9lB7k4WM/UNBzbxFERXI/AAAAAAAAABs/fgtgq4Oou7A/s320/site-speed-graph.jpg>
 * img: <http://2.bp.blogspot.com/-iDY0zmQGR0U/ULi9vz7HA9I/AAAAAAAAAAw/xRgd4uJBf4M/s640/Injection_Lifecycle.png>
 * img: <http://4.bp.blogspot.com/-RGp_r_1umNw/ULjAKAF4-KI/AAAAAAAAABI/vxb7gteXvJE/s400/DarkLeach2.png>
 * img: <http://2.bp.blogspot.com/-UnIaksmuecE/ULjdzETBmiI/AAAAAAAAABY/OhbF0wZObus/s400/Firewall_Diagram.png>
 * img: <https://resources.blogblog.com/img/icon18_wrench_allbkg.png>
 * script: <http://blog.shakatechnologies.com/js/cookiechoices.js>
 * script: <https://www.blogger.com/static/v1/widgets/3916107237-widgets.js>
 * script: <https://apis.google.com/js/plusone.js>
 * script: <http://www.google.com/jsapi>
 * iframe: <http://blog.shakatechnologies.com/2013/06/ishlangu-14-released-web-acceleration.html>
 * script: <https://www.blogger.com/static/v1/jsbin/592886021-comment_from_post_iframe.js>
 * iframe: <http://blog.shakatechnologies.com/2012/12/speed-counts.html>
 * img: <http://1.bp.blogspot.com/-iUEd-mZhxIg/UJJrizwqOVI/AAAAAAAAABw/Jg5CkRypW6Q/s1600/ishlangu-large.png>
 * script: <https://www.blogger.com/static/v1/widgets/4222102575-widgets.js>
 * embed: <http://www.youtube.com/v/K7zrso5Z2hA&fs=1&source=uds>
 * iframe: <http://blog.shakatechnologies.com/2013/06/ishlangu-14-released-web-acceleration.html#comment-form>
 * gd:image: <http://img1.blogblog.com/img/b16-rounded.gif>
 * iframe: <http://blog.shakatechnologies.com/2013/02/ishlangu-12-is-here.html>
 * iframe: <http://blog.shakatechnologies.com/2013/02/ishlangu-12-is-here.html#comment-form>
 * iframe: <http://blog.shakatechnologies.com/2012/12/speed-counts.html#comment-form>
 * iframe: <http://blog.shakatechnologies.com/2012/12/ishlangu-11-released-geo-ip-and-spdy.html>
 * iframe: <http://blog.shakatechnologies.com/2012/12/ishlangu-11-released-geo-ip-and-spdy.html#comment-form>
 * iframe: <http://blog.shakatechnologies.com/2012/11/website-code-injection-and-how-it.html>
 * iframe: <http://blog.shakatechnologies.com/2012/11/website-code-injection-and-how-it.html#comment-form>
 * iframe: <http://blog.shakatechnologies.com/2012/11/ishlangu-ultimate-control-with-ucontrol.html>
 * iframe: <http://blog.shakatechnologies.com/2012/11/ishlangu-ultimate-control-with-ucontrol.html#comment-form>
 * iframe: <http://blog.shakatechnologies.com/2012/11/introducing-ishlangu.html>
 * iframe: <http://blog.shakatechnologies.com/2012/11/introducing-ishlangu.html#comment-form>

Imports: (143)
 * link <http://blog.shakatechnologies.com/favicon.ico>
 * link <http://blog.shakatechnologies.com/>
 * link <http://blog.shakatechnologies.com/feeds/posts/default>
 * link <http://blog.shakatechnologies.com/feeds/posts/default?alt=rss>
 * link <https://www.blogger.com/feeds/6473524622302540311/posts/default>
 * link <https://www.blogger.com/profile/14505504939165720309>
 * link <https://www.blogger.com/openid-server.g>
 * link <https://www.blogger.com/static/v1/widgets/2901518656-css_bundle_v2.css>
 * link <http://www.google.com/uds/css/gsearch.css>
 * link <https://www.blogger.com/dyn-css/authorization.css?targetBlogID=6473524622302540311&zx=d57f19b9-32c0-4c4a-b890-919c40ae7e39>
 * link <http://blog.shakatechnologies.com/2013/06/ishlangu-14-released-web-acceleration.html>
 * link <http://blog.shakatechnologies.com/feeds/2110002104691610985/comments/default>
 * link <http://2.bp.blogspot.com/-6UhrPXfDse8/UaxlmAW_cnI/AAAAAAAAAD4/C4jYZSBqU9w/s1600/vm.png>
 * link <http://blog.shakatechnologies.com/2012/12/speed-counts.html>
 * link <http://blog.shakatechnologies.com/feeds/5104993487956986661/comments/default>
 * link <http://1.bp.blogspot.com/-2Fk9lB7k4WM/UNBzbxFERXI/AAAAAAAAABs/fgtgq4Oou7A/s320/site-speed-graph.jpg>
 * link <http://blog.shakatechnologies.com/search/label/Application%20Delivery%20Controller>
 * link <http://blog.shakatechnologies.com/2013/04/ishlangu-13-is-out-download-today.html>
 * link <http://blog.shakatechnologies.com/feeds/948162214091338240/comments/default>
 * link <http://1.bp.blogspot.com/-ptunc6wRZeA/UXZxzKD5IdI/AAAAAAAAAC8/vRlSmNaXYSU/s1600/directory.png>
 * link <http://blog.shakatechnologies.com/search/label/Access%20Control>
 * link <http://blog.shakatechnologies.com/2013/05/securely-publishing-web-apps-in-post.html>
 * link <http://blog.shakatechnologies.com/feeds/1522894797833222379/comments/default>
 * link <http://1.bp.blogspot.com/-yQANffK68Dg/UYDm0Hx9GhI/AAAAAAAAACU/u92rG8v0Xqo/s400/Screen+Shot+2013-05-01+at+10.56.09.png>
 * link <https://www.blogger.com/static/v1/widgets/836358922-css_bundle_v2.css>
 * link <http://blog.shakatechnologies.com/search/label/Active%20Directory>
 * link <http://blog.shakatechnologies.com/search/label/Exchange%20CAS%20Publishing>
 * link <http://blog.shakatechnologies.com/search/label/NTLM>
 * link <http://blog.shakatechnologies.com/search/label/SharePoint%20Publishing>
 * link <http://blog.shakatechnologies.com/search/label/Single%20Sign%20On>
 * link <http://blog.shakatechnologies.com/search/label/SSO>
 * link <http://blog.shakatechnologies.com/search/label/TMG>
 * link <http://blog.shakatechnologies.com/search/label/UAG>
 * link <http://blog.shakatechnologies.com/search/label/Web%20Application%20Firewall>
 * link <http://blog.shakatechnologies.com/search/label/Web%20Application%20Security>
 * link <http://blog.shakatechnologies.com/search/label/Auditing>
 * link <http://blog.shakatechnologies.com/search/label/Ishlangu>
 * link <http://blog.shakatechnologies.com/search/label/load%20time>
 * link <http://blog.shakatechnologies.com/search/label/page%20speed>
 * link <http://blog.shakatechnologies.com/search/label/Release%20Announcement>
 * link <http://blog.shakatechnologies.com/search/label/resource%20optimization>
 * link <http://blog.shakatechnologies.com/search/label/uControl%20Script>
 * link <http://blog.shakatechnologies.com/search/label/WCO>
 * link <http://blog.shakatechnologies.com/search/label/Web%20Acceleration>
 * link <http://blog.shakatechnologies.com/search/label/Web%20Optimization>
 * link <http://blog.shakatechnologies.com/search/label/WRO>
 * link <http://blog.shakatechnologies.com/search/label/WRO?updated-max=2013-06-03T10:04:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://www.blogger.com/feeds/6473524622302540311/posts/default>
 * link <http://pubsubhubbub.appspot.com/>
 * link <http://blog.shakatechnologies.com/2013/06/ishlangu-14-released-web-acceleration.html#comment-form>
 * link <http://www.blogger.com/feeds/6473524622302540311/posts/default/2110002104691610985>
 * link <http://www.blogger.com/feeds/6473524622302540311/posts/default/1522894797833222379>
 * link <http://www.blogger.com/feeds/6473524622302540311/posts/default/948162214091338240>
 * link <http://blog.shakatechnologies.com/feeds/14248172749080226/comments/default>
 * link <http://blog.shakatechnologies.com/2013/02/ishlangu-12-is-here.html#comment-form>
 * link <http://www.blogger.com/feeds/6473524622302540311/posts/default/14248172749080226>
 * link <http://blog.shakatechnologies.com/2013/02/ishlangu-12-is-here.html>
 * link <http://blog.shakatechnologies.com/2012/12/speed-counts.html#comment-form>
 * link <http://www.blogger.com/feeds/6473524622302540311/posts/default/5104993487956986661>
 * link <http://blog.shakatechnologies.com/feeds/494673256396563138/comments/default>
 * link <http://blog.shakatechnologies.com/2012/12/ishlangu-11-released-geo-ip-and-spdy.html#comment-form>
 * link <http://www.blogger.com/feeds/6473524622302540311/posts/default/494673256396563138>
 * link <http://blog.shakatechnologies.com/2012/12/ishlangu-11-released-geo-ip-and-spdy.html>
 * link <http://blog.shakatechnologies.com/feeds/5858787094937915923/comments/default>
 * link <http://blog.shakatechnologies.com/2012/11/website-code-injection-and-how-it.html#comment-form>
 * link <http://www.blogger.com/feeds/6473524622302540311/posts/default/5858787094937915923>
 * link <http://blog.shakatechnologies.com/2012/11/website-code-injection-and-how-it.html>
 * link <http://blog.shakatechnologies.com/feeds/8441927337666222799/comments/default>
 * link <http://blog.shakatechnologies.com/2012/11/ishlangu-ultimate-control-with-ucontrol.html#comment-form>
 * link <http://www.blogger.com/feeds/6473524622302540311/posts/default/8441927337666222799>
 * link <http://blog.shakatechnologies.com/2012/11/ishlangu-ultimate-control-with-ucontrol.html>
 * link <http://blog.shakatechnologies.com/feeds/1835358602520109861/comments/default>
 * link <http://blog.shakatechnologies.com/2012/11/introducing-ishlangu.html#comment-form>
 * link <http://www.blogger.com/feeds/6473524622302540311/posts/default/1835358602520109861>
 * link <http://blog.shakatechnologies.com/2012/11/introducing-ishlangu.html>
 * link <http://blog.shakatechnologies.com/search?updated-min=2012-12-31T16:00:00-08:00&updated-max=2013-12-31T16:00:00-08:00&max-results=4>
 * link <http://blog.shakatechnologies.com/search/label/LDAP>
 * link <http://blog.shakatechnologies.com/search/label/LDAP?updated-max=2013-04-23T08:38:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/2013_06_01_archive.html>
 * link <http://blog.shakatechnologies.com/search?updated-max=2013-06-03T10:04:00-07:00&max-results=7>
 * link <http://4.bp.blogspot.com/-vYUFHXQ1zFY/UTDv264MKoI/AAAAAAAAACQ/HKjAxvZL1AE/s1600/cache.png>
 * link <http://blog.shakatechnologies.com/feeds/comments/default>
 * link <http://www.blogger.com/feeds/6473524622302540311/14248172749080226/comments/default>
 * link <http://blog.shakatechnologies.com/2013_05_01_archive.html>
 * link <http://blog.shakatechnologies.com/search?updated-max=2013-05-01T05:30:00-07:00&max-results=7>
 * link <http://blog.shakatechnologies.com/2013_04_01_archive.html>
 * link <http://blog.shakatechnologies.com/search?updated-max=2013-04-23T08:38:00-07:00&max-results=7>
 * link <http://blog.shakatechnologies.com/search/label/Content%20Rewriting>
 * link <http://blog.shakatechnologies.com/search/label/High%20Availability>
 * link <http://blog.shakatechnologies.com/search/label/Response%20Processing>
 * link <http://blog.shakatechnologies.com/search/label/SPDY>
 * link <http://blog.shakatechnologies.com/search/label/Speedy>
 * link <http://blog.shakatechnologies.com/search/label/geo-ip>
 * link <http://blog.shakatechnologies.com/search/label/Geolocation>
 * link <http://blog.shakatechnologies.com/search/label/Geolocation?updated-max=2012-12-17T02:47:00-08:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/2013_02_01_archive.html>
 * link <http://blog.shakatechnologies.com/search?updated-max=2013-02-27T02:56:00-08:00&max-results=7>
 * link <http://2.bp.blogspot.com/-iDY0zmQGR0U/ULi9vz7HA9I/AAAAAAAAAAw/xRgd4uJBf4M/s640/Injection_Lifecycle.png>
 * link <http://blog.shakatechnologies.com/search/label/Code%20Injection>
 * link <http://blog.shakatechnologies.com/search/label/Content%20Manipulation>
 * link <http://blog.shakatechnologies.com/search/label/Ishlangu%20Video%20Tutorials>
 * link <http://1.bp.blogspot.com/-iUEd-mZhxIg/UJJrizwqOVI/AAAAAAAAABw/Jg5CkRypW6Q/s1600/ishlangu-large.png>
 * link <http://www.blogger.com/feeds/6473524622302540311/1835358602520109861/comments/default>
 * link <http://blog.shakatechnologies.com/search?updated-min=2011-12-31T16:00:00-08:00&updated-max=2012-12-31T16:00:00-08:00&max-results=5>
 * link <http://blog.shakatechnologies.com/2012_12_01_archive.html>
 * link <http://blog.shakatechnologies.com/search?updated-max=2012-12-17T02:47:00-08:00&max-results=7>
 * link <http://blog.shakatechnologies.com/2012_11_01_archive.html>
 * link <http://www.blogger.com/feeds/6473524622302540311/8441927337666222799/comments/default>
 * link <http://blog.shakatechnologies.com/search/label/Ishlangu%20Video%20Tutorials?updated-max=2012-11-02T06:05:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/Content%20Manipulation?updated-max=2012-11-02T06:05:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://www.blogger.com/feeds/6473524622302540311/5858787094937915923/comments/default>
 * link <http://blog.shakatechnologies.com/search/label/Code%20Injection?updated-max=2012-11-30T08:36:00-08:00&max-results=20&start=20&by-date=false>
 * link <http://www.blogger.com/feeds/6473524622302540311/494673256396563138/comments/default>
 * link <http://blog.shakatechnologies.com/search/label/geo-ip?updated-max=2012-12-17T02:47:00-08:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/Speedy?updated-max=2012-12-17T02:47:00-08:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/SPDY?updated-max=2012-12-17T02:47:00-08:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/Response%20Processing?updated-max=2012-11-02T06:05:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/Content%20Rewriting?updated-max=2012-11-02T06:05:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://www.blogger.com/feeds/6473524622302540311/5104993487956986661/comments/default>
 * link <http://blog.shakatechnologies.com/search?updated-max=2012-11-02T06:05:00-07:00&max-results=7&start=7&by-date=false>
 * link <http://blog.shakatechnologies.com/search?updated-max=2013-06-03T10:04:00-07:00&max-results=7&reverse-paginate=true>
 * link <http://blog.shakatechnologies.com/search?updated-max=2012-11-02T06:05:00-07:00&max-results=7&reverse-paginate=true&start=7&by-date=false>
 * link <http://blog.shakatechnologies.com/search?updated-min=2012-12-31T16:00:00-08:00&updated-max=2013-02-27T02:56:00-08:00&max-results=4&start=4&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/Web%20Optimization?updated-max=2013-06-03T10:04:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/Web%20Acceleration?updated-max=2013-06-03T10:04:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/WCO?updated-max=2013-06-03T10:04:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/uControl%20Script?updated-max=2012-11-02T06:05:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/resource%20optimization?updated-max=2013-06-03T10:04:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/Release%20Announcement?updated-max=2012-12-17T02:47:00-08:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/page%20speed?updated-max=2012-12-17T02:47:00-08:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/load%20time?updated-max=2013-06-03T10:04:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://www.blogger.com/feeds/6473524622302540311/2110002104691610985/comments/default>
 * link <http://blog.shakatechnologies.com/search/label/Auditing?updated-max=2013-04-23T08:38:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/UAG?updated-max=2013-05-01T05:30:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/TMG?updated-max=2013-05-01T05:30:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/SSO?updated-max=2013-04-23T08:38:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/Single%20Sign%20On?updated-max=2013-04-23T08:38:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/SharePoint%20Publishing?updated-max=2013-05-01T05:30:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/NTLM?updated-max=2013-05-01T05:30:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/Exchange%20CAS%20Publishing?updated-max=2013-05-01T05:30:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/Active%20Directory?updated-max=2013-04-23T08:38:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search/label/Access%20Control?updated-max=2013-04-23T08:38:00-07:00&max-results=20&start=20&by-date=false>
 * link <http://blog.shakatechnologies.com/search?updated-max=2012-11-30T08:36:00-08:00&max-results=7>

Anchors: (194)
http://blog.shakatechnologies.com/2013/06/ishlangu-14-released-web-acceleration.html
http://blog.shakatechnologies.com/
http://blog.shakatechnologies.com/2012/12/speed-counts.html
http://1.bp.blogspot.com/-2Fk9lB7k4WM/UNBzbxFERXI/AAAAAAAAABs/fgtgq4Oou7A/s1600/site-speed-graph.jpg
http://blog.kissmetrics.com/loading-time/?wide=1
http://www.scribd.com/doc/4970486/Make-Data-Useful-by-Greg-Linden-Amazoncom
http://www.nytimes.com/2012/03/01/technology/impatient-web-users-flee-slow-loading-sites.html?pagewanted=1&_r=3
http://www.gartner.com/id=1392736
http://bgr.com/2012/11/26/black-friday-sales-2012-cyber-monday-record/
http://www.chromium.org/spdy/spdy-whitepaper
http://www.gartner.com/id=2218015
http://www.shakatechnologies.com/index.php/product/ishlangu
https://www.blogger.com/profile/04171736287878685526
https://www.blogger.com/post-edit.g?blogID=6473524622302540311&postID=5104993487956986661&from=pencil
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=5104993487956986661&target=email
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=5104993487956986661&target=blog
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=5104993487956986661&target=twitter
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=5104993487956986661&target=facebook
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=5104993487956986661&target=pinterest
http://blog.shakatechnologies.com/search/label/Application%20Delivery%20Controller
http://blog.shakatechnologies.com/2013/04/ishlangu-13-is-out-download-today.html
http://www.shakatechnologies.com/index.php/try-ishlangu-free
https://www.blogger.com/profile/14505504939165720309
https://www.blogger.com/post-edit.g?blogID=6473524622302540311&postID=948162214091338240&from=pencil
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=948162214091338240&target=email
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=948162214091338240&target=blog
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=948162214091338240&target=twitter
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=948162214091338240&target=facebook
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=948162214091338240&target=pinterest
http://blog.shakatechnologies.com/search/label/Access%20Control
http://blog.shakatechnologies.com/2013/05/securely-publishing-web-apps-in-post.html
http://blogs.technet.com/b/server-cloud/archive/2012/09/12/important-changes-to-forefront-product-roadmaps.aspx
http://1.bp.blogspot.com/-yQANffK68Dg/UYDm0Hx9GhI/AAAAAAAAACU/u92rG8v0Xqo/s1600/Screen+Shot+2013-05-01+at+10.56.09.png
http://1.bp.blogspot.com/-AoMef_gbHVM/UYDuaR3n-VI/AAAAAAAAACk/uzni4ZqnPRw/s1600/Screen+Shot+2013-05-01+at+11.05.16.png
https://www.blogger.com/post-edit.g?blogID=6473524622302540311&postID=1522894797833222379&from=pencil
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=1522894797833222379&target=email
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=1522894797833222379&target=blog
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=1522894797833222379&target=twitter
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=1522894797833222379&target=facebook
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=1522894797833222379&target=pinterest
http://blog.shakatechnologies.com/search/label/Active%20Directory
http://blog.shakatechnologies.com/search/label/Exchange%20CAS%20Publishing
http://blog.shakatechnologies.com/search/label/NTLM
http://blog.shakatechnologies.com/search/label/SharePoint%20Publishing
http://blog.shakatechnologies.com/search/label/Single%20Sign%20On
http://blog.shakatechnologies.com/search/label/SSO
http://blog.shakatechnologies.com/search/label/TMG
http://blog.shakatechnologies.com/search/label/UAG
http://blog.shakatechnologies.com/search/label/Web%20Application%20Firewall
http://blog.shakatechnologies.com/search/label/Web%20Application%20Security
http://blog.shakatechnologies.com/search/label/Auditing
http://blog.shakatechnologies.com/search/label/Ishlangu
http://blog.shakatechnologies.com/2013/06/ishlangu-14-released-web-acceleration.html#comment-form
https://www.blogger.com/post-edit.g?blogID=6473524622302540311&postID=2110002104691610985&from=pencil
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=2110002104691610985&target=email
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=2110002104691610985&target=blog
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=2110002104691610985&target=twitter
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=2110002104691610985&target=facebook
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=2110002104691610985&target=pinterest
http://blog.shakatechnologies.com/search/label/load%20time
http://blog.shakatechnologies.com/search/label/page%20speed
http://blog.shakatechnologies.com/search/label/Release%20Announcement
http://blog.shakatechnologies.com/search/label/resource%20optimization
http://blog.shakatechnologies.com/search/label/uControl%20Script
http://blog.shakatechnologies.com/search/label/WCO
http://blog.shakatechnologies.com/search/label/Web%20Acceleration
http://blog.shakatechnologies.com/search/label/Web%20Optimization
http://blog.shakatechnologies.com/search/label/WRO
http://blog.shakatechnologies.com/search/label/WRO?updated-max=2013-06-03T18:04:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/feeds/posts/default
http://www.blogger.com/rearrange?blogID=6473524622302540311&widgetType=CustomSearch&widgetId=CustomSearch1&action=editWidget&sectionId=sidebar-right-1

http://blog.shakatechnologies.com/search?updated-min=2013-01-01T00:00:00Z&updated-max=2014-01-01T00:00:00Z&max-results=4
http://blog.shakatechnologies.com/search/label/LDAP
http://blog.shakatechnologies.com/search/label/LDAP?updated-max=2013-04-23T16:38:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/2013_06_01_archive.html
http://blog.shakatechnologies.com/search?updated-max=2013-06-03T18:04:00%2B01:00&max-results=7
http://blog.shakatechnologies.com/2013/02/ishlangu-12-is-here.html
https://www.blogger.com/post-edit.g?blogID=6473524622302540311&postID=14248172749080226&from=pencil
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=14248172749080226&target=email
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=14248172749080226&target=blog
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=14248172749080226&target=twitter
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=14248172749080226&target=facebook
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=14248172749080226&target=pinterest
https://www.blogger.com/comment-iframe.g?blogID=6473524622302540311&postID=14248172749080226
http://blog.shakatechnologies.com/feeds/14248172749080226/comments/default
http://blog.shakatechnologies.com/2013_05_01_archive.html
http://blog.shakatechnologies.com/search?updated-max=2013-05-01T13:30:00%2B01:00&max-results=7
http://blog.shakatechnologies.com/2013/02/ishlangu-12-is-here.html#comment-form
http://blog.shakatechnologies.com/2013_04_01_archive.html
http://blog.shakatechnologies.com/search?updated-max=2013-04-23T16:38:00%2B01:00&max-results=7
http://blog.shakatechnologies.com/2012/12/speed-counts.html#comment-form
http://blog.shakatechnologies.com/search/label/Content%20Rewriting
http://blog.shakatechnologies.com/search/label/High%20Availability
http://blog.shakatechnologies.com/search/label/Response%20Processing
http://blog.shakatechnologies.com/search/label/SPDY
http://blog.shakatechnologies.com/search/label/Speedy
http://blog.shakatechnologies.com/2012/12/ishlangu-11-released-geo-ip-and-spdy.html
https://www.blogger.com/post-edit.g?blogID=6473524622302540311&postID=494673256396563138&from=pencil
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=494673256396563138&target=email
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=494673256396563138&target=blog
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=494673256396563138&target=twitter
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=494673256396563138&target=facebook
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=494673256396563138&target=pinterest
http://blog.shakatechnologies.com/search/label/geo-ip
http://blog.shakatechnologies.com/2012/12/ishlangu-11-released-geo-ip-and-spdy.html#comment-form
http://blog.shakatechnologies.com/search/label/Geolocation
http://blog.shakatechnologies.com/search/label/Geolocation?updated-max=2012-12-17T10:47:00Z&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/2013_02_01_archive.html
http://blog.shakatechnologies.com/search?updated-max=2013-02-27T10:56:00Z&max-results=7
http://blog.shakatechnologies.com/2012/11/website-code-injection-and-how-it.html
http://2.bp.blogspot.com/-iDY0zmQGR0U/ULi9vz7HA9I/AAAAAAAAAAw/xRgd4uJBf4M/s1600/Injection_Lifecycle.png
http://4.bp.blogspot.com/-RGp_r_1umNw/ULjAKAF4-KI/AAAAAAAAABI/vxb7gteXvJE/s1600/DarkLeach2.png
http://2.bp.blogspot.com/-UnIaksmuecE/ULjdzETBmiI/AAAAAAAAABY/OhbF0wZObus/s1600/Firewall_Diagram.png
https://www.blogger.com/post-edit.g?blogID=6473524622302540311&postID=5858787094937915923&from=pencil
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=5858787094937915923&target=email
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=5858787094937915923&target=blog
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=5858787094937915923&target=twitter
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=5858787094937915923&target=facebook
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=5858787094937915923&target=pinterest
http://blog.shakatechnologies.com/search/label/Code%20Injection
http://blog.shakatechnologies.com/2012/11/website-code-injection-and-how-it.html#comment-form
http://blog.shakatechnologies.com/search/label/Content%20Manipulation
http://blog.shakatechnologies.com/2012/11/ishlangu-ultimate-control-with-ucontrol.html
http://www.youtube.com/shakatechnologies
https://www.blogger.com/post-edit.g?blogID=6473524622302540311&postID=8441927337666222799&from=pencil
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=8441927337666222799&target=email
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=8441927337666222799&target=blog
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=8441927337666222799&target=twitter
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=8441927337666222799&target=facebook
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=8441927337666222799&target=pinterest
http://blog.shakatechnologies.com/search/label/Ishlangu%20Video%20Tutorials
http://blog.shakatechnologies.com/2012/11/ishlangu-ultimate-control-with-ucontrol.html#comment-form
https://www.blogger.com/comment-iframe.g?blogID=6473524622302540311&postID=8441927337666222799
http://blog.shakatechnologies.com/2012/11/introducing-ishlangu.html
http://1.bp.blogspot.com/-iUEd-mZhxIg/UJJrizwqOVI/AAAAAAAAABw/Jg5CkRypW6Q/s1600/ishlangu-large.png
http://en.wikipedia.org/wiki/Application_delivery_controller
http://www.shakatechnologies.com/
https://www.blogger.com/post-edit.g?blogID=6473524622302540311&postID=1835358602520109861&from=pencil
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=1835358602520109861&target=email
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=1835358602520109861&target=blog
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=1835358602520109861&target=twitter
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=1835358602520109861&target=facebook
https://www.blogger.com/share-post.g?blogID=6473524622302540311&postID=1835358602520109861&target=pinterest
https://www.blogger.com/comment-iframe.g?blogID=6473524622302540311&postID=1835358602520109861
http://blog.shakatechnologies.com/feeds/1835358602520109861/comments/default
http://blog.shakatechnologies.com/search?updated-min=2012-01-01T00:00:00Z&updated-max=2013-01-01T00:00:00Z&max-results=5
http://blog.shakatechnologies.com/2012/11/introducing-ishlangu.html#comment-form
http://blog.shakatechnologies.com/2012_12_01_archive.html
http://blog.shakatechnologies.com/search?updated-max=2012-12-17T10:47:00Z&max-results=7
http://blog.shakatechnologies.com/2012_11_01_archive.html
http://www.blogger.com/rearrange?blogID=6473524622302540311&widgetType=BlogArchive&widgetId=BlogArchive1&action=editWidget&sectionId=sidebar-right-1
https://www.blogger.com
http://www.blogger.com/rearrange?blogID=6473524622302540311&widgetType=Attribution&widgetId=Attribution1&action=editWidget&sectionId=footer-3
http://blog.shakatechnologies.com/feeds/8441927337666222799/comments/default
http://blog.shakatechnologies.com/search/label/Ishlangu%20Video%20Tutorials?updated-max=2012-11-02T13:05:00Z&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/Content%20Manipulation?updated-max=2012-11-02T13:05:00Z&max-results=20&start=20&by-date=false
https://www.blogger.com/comment-iframe.g?blogID=6473524622302540311&postID=5858787094937915923
http://blog.shakatechnologies.com/feeds/5858787094937915923/comments/default
http://blog.shakatechnologies.com/search/label/Code%20Injection?updated-max=2012-11-30T16:36:00Z&max-results=20&start=20&by-date=false
https://www.blogger.com/comment-iframe.g?blogID=6473524622302540311&postID=494673256396563138
http://blog.shakatechnologies.com/feeds/494673256396563138/comments/default
http://blog.shakatechnologies.com/search/label/geo-ip?updated-max=2012-12-17T10:47:00Z&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/Speedy?updated-max=2012-12-17T10:47:00Z&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/SPDY?updated-max=2012-12-17T10:47:00Z&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/Response%20Processing?updated-max=2012-11-02T13:05:00Z&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/Content%20Rewriting?updated-max=2012-11-02T13:05:00Z&max-results=20&start=20&by-date=false
https://www.blogger.com/comment-iframe.g?blogID=6473524622302540311&postID=5104993487956986661
http://blog.shakatechnologies.com/feeds/5104993487956986661/comments/default
http://blog.shakatechnologies.com/search?updated-max=2012-11-02T13:05:00Z&max-results=7&start=7&by-date=false
http://blog.shakatechnologies.com/search?updated-max=2013-06-03T18:04:00%2B01:00&max-results=7&reverse-paginate=true
http://blog.shakatechnologies.com/search?updated-max=2012-11-02T13:05:00Z&max-results=7&reverse-paginate=true&start=7&by-date=false
http://blog.shakatechnologies.com/search?updated-min=2012-12-31T16:00:00-08:00&updated-max=2013-02-27T10:56:00Z&max-results=4&start=4&by-date=false
http://blog.shakatechnologies.com/search/label/Web%20Optimization?updated-max=2013-06-03T18:04:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/Web%20Acceleration?updated-max=2013-06-03T18:04:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/WCO?updated-max=2013-06-03T18:04:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/uControl%20Script?updated-max=2012-11-02T13:05:00Z&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/resource%20optimization?updated-max=2013-06-03T18:04:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/Release%20Announcement?updated-max=2012-12-17T10:47:00Z&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/page%20speed?updated-max=2012-12-17T10:47:00Z&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/load%20time?updated-max=2013-06-03T18:04:00%2B01:00&max-results=20&start=20&by-date=false
https://www.blogger.com/comment-iframe.g?blogID=6473524622302540311&postID=2110002104691610985
http://blog.shakatechnologies.com/feeds/2110002104691610985/comments/default
http://blog.shakatechnologies.com/search/label/Auditing?updated-max=2013-04-23T16:38:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/UAG?updated-max=2013-05-01T13:30:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/TMG?updated-max=2013-05-01T13:30:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/SSO?updated-max=2013-04-23T16:38:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/Single%20Sign%20On?updated-max=2013-04-23T16:38:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/SharePoint%20Publishing?updated-max=2013-05-01T13:30:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/NTLM?updated-max=2013-05-01T13:30:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/Exchange%20CAS%20Publishing?updated-max=2013-05-01T13:30:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/Active%20Directory?updated-max=2013-04-23T16:38:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search/label/Access%20Control?updated-max=2013-04-23T16:38:00%2B01:00&max-results=20&start=20&by-date=false
http://blog.shakatechnologies.com/search?updated-max=2012-11-30T16:36:00Z&max-results=7
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 26.838 s
[INFO] Finished at: 2016-06-28T12:23:05+01:00
[INFO] Final Memory: 7M/232M
[INFO] ------------------------------------------------------------------------
```

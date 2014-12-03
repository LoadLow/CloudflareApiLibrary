CloudflareApiLibrary
====================

Use Cloudflare API in Java
- Documentation of API : http://www.cloudflare.com/docs/client-api.html
- Documentation of my Lib : http://loadlow.github.io/CloudflareApiLibrary/

`````
  This lib allows you to use easier and faster the CloudflareAPI.
  (Used libs like ApacheHTTP, JSON... are in the "lib" folder)
`````

<h4>Exemple using requests :</h4>
(All CloudflareRequests are in the "com.cloudflare.api.requests" package)
`````java
CloudflareAccess access = new CloudflareAccess(
                "CF_MAIL",
                "CF_APIKEY");
        
CloudflareRequest request = new CloudflareRequest(access, ...);
try {
            boolean result = request.execute();
            System.out.println("Operation executed : " + result);
} catch (CloudflareError e) {
            e.printStackTrace();
}
`````

<h4>Informations :</h4>
- This lib returns API errors with Exceptions (CloudflareException)
- The package constants contains ALL constants of the CloudflareAPI (even if some unused)
- This API is available for all Cloudflare accounts (and free accounts!)

<h4>Required :</h4>
- A Cloudflare Account
- An APIKey generated on the Cloudflare Account Settings panel
- The mail of your account
- A specific domain using Cloudflare and linked with your Cloudflare Account

<h4>Available :</h4>
- Create/Edit DNS Records (CNAME, MX, AA, AAAA, SPF, NS, TXT, LOC)
- Edit Cache Level (Aggressive, basic)
- Trust/Block/Unlist IP Address
- Modify Minify Level (JS, HTML, CSS)
- Change RocketLoader Status(Off, Automatic, Manual)
- Edit Security Level(UnderAttack, Hight, Medium, Low, Essentialy off)
- Purge cache and purge a specified file from cache
- Toggle Always Online status
- Toggle Development mode 
- Toogle IPV6 Support
- Update zone challenge stats

<h4>TODO :</h4>
- Parsing Statistics Responses
- Create SRV Record

Copyright (c) 2014 LoadLow

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

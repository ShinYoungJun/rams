    var x, y;
    var objDoc;
    var objIE = document.all;
    var objOtherBrowsers = document.getElementById && !document.all;
    var blIsDrag = false;
    function fnMoveMouse(e)
    {
      if (blIsDrag)
      {
        objDoc.style.left = objOtherBrowsers ? intLeftX + e.clientX - x : intLeftX + event.clientX - x;
        objDoc.style.top  = objOtherBrowsers ? intTopY + e.clientY - y : intTopY + event.clientY - y;
    
        return false;
      }
    }
    function fnSelectMouse(e)
    {
      var objF = objOtherBrowsers ? e.target : event.srcElement;
      var strTopElement = objOtherBrowsers ? "HTML" : "BODY";
  
      while (objF.tagName != strTopElement && objF.className != "clsDrag")
        objF = objOtherBrowsers ? objF.parentNode : objF.parentElement;
      if (objF.className == "clsDrag")
      {
        blIsDrag = true;
        objDoc = objF;
        intLeftX = parseInt(objDoc.style.left + 0, 10);
        intTopY = parseInt(objDoc.style.top + 0, 10);
        x = objOtherBrowsers ? e.clientX : event.clientX;
        y = objOtherBrowsers ? e.clientY : event.clientY;
    
        document.onmousemove = fnMoveMouse;
    
        return false;
      }
    }
    document.onmousedown = fnSelectMouse;
    document.onmouseup = new Function("blIsDrag = false");
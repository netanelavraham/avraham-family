
var acronymArr = [];
acronymArr.push({sign : "א", acm : "אלף", gematria : 111});
acronymArr.push({sign : "ב", acm : "בית", gematria : 412});
acronymArr.push({sign : "ג", acm : "גימל", gematria : 73});
acronymArr.push({sign : "ד", acm : "דלת", gematria : 434});
acronymArr.push({sign : "ה", acm : "הא", gematria : 6});
acronymArr.push({sign : "ו", acm : "ואו", gematria : 12});
acronymArr.push({sign : "ז", acm : "זין", gematria : 67});
acronymArr.push({sign : "ח", acm : "חית", gematria : 418});
acronymArr.push({sign : "ט", acm : "טית", gematria : 419});
acronymArr.push({sign : "י", acm : "יוד", gematria : 20});
acronymArr.push({sign : "כ", acm : "כף", gematria : 100});
acronymArr.push({sign : "ך", acm : "כף", gematria : 100});
acronymArr.push({sign : "ל", acm : "למד", gematria : 504});
acronymArr.push({sign : "מ", acm : "מם", gematria : 8});
acronymArr.push({sign : "ם", acm : "מם", gematria : 80});
acronymArr.push({sign : "נ", acm : "נון", gematria : 112});
acronymArr.push({sign : "ן", acm : "נון", gematria : 112});
acronymArr.push({sign : "ס", acm : "סמך", gematria : 200});
acronymArr.push({sign : "ע", acm : "עין", gematria : 140});
acronymArr.push({sign : "פ", acm : "פא", gematria : 191});
acronymArr.push({sign : "ף", acm : "פא", gematria : 191});
acronymArr.push({sign : "צ", acm : "צדי", gematria : 544});
acronymArr.push({sign : "ץ", acm : "צדי", gematria : 544});
acronymArr.push({sign : "ק", acm : "קוף", gematria : 192});
acronymArr.push({sign : "ר", acm : "ריש", gematria : 520});
acronymArr.push({sign : "ש", acm : "שין", gematria : 370});
acronymArr.push({sign : "ת", acm : "תאו", gematria : 412});
//alert(acronymArr[0].sign);

var checkSource = "";

function checkAcronym(){
	if(checkSource == ""){ 
		checkSource = document.getElementById("userInput").value;
		if(checkSource == "" || checkSource == null){
			alert("הזן אות מלה או משפט בשדה הטקסט");
			return;
		}
		
		$("#resTab tbody:last").append("<tr><td>" + checkSource.length + "</td><td style=\"word-break: break-all;\">" + checkSource + "</td></tr>");
		return;
	}
	var resRow = "";
	var totalG = 0;
	var rowLength = 0;
	for(xa=0;xa<checkSource.length;xa++){
		for(xb=0;xb<acronymArr.length;xb++){
			if(acronymArr[xb].sign == checkSource.charAt(xa)){
				resRow += "<span class=\"alter\"> " + acronymArr[xb].acm + " </span>";
				rowLength += acronymArr[xb].acm.length;
			}
		}
	}
	
	//$("#resTab tbody:last").append("<tr><td>" + totalG + "</td><td>" + resRow.length + "</td><td style=\"word-break: break-all;\">" + resRow.substring(0, 500) + "</td></tr>");
	
	var maxLength = resRow.length > 5000 ? resRow.indexOf("</span>", 5000) + 7: 5000;
	
	$("#resTab tbody:last").append("<tr><td>" + rowLength + "</td><td style=\"word-break: break-all;\">" + resRow.substring(0, maxLength) + "</td></tr>");
	
	checkSource = resRow;
	
	$("html, body").animate({ scrollTop: $(document).height() }, "slow");
}
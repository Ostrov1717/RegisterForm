
 function manage(txt) {
        var bt = document.getElementById('btSubmit');
        if (txt.value == "agree") {
            bt.disabled = false;
            }
        else {
            bt.disabled = true;
        }
    }
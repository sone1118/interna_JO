function loginClick() {
	
	try{
		//fetch /login
		//if 쿠키가 왔음
		const token = {
			access: "asdf1234",
			refresh: "1111asdf",
		}
	//쿠키에 값 저장		
	setCookie('access', token.access, 1);
	setCookie('refresh', token.refresh, 1);
	
	}catch(error) { //login 실패 error가 왔음
		//error를 붙여셔 redirect /
	}

}
document.querySelector("#login_button").addEventListener("click", loginClick);
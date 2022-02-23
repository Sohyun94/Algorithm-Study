// 찜 버튼 선택
let pickButton = document.querySelectorAll(".pickButton");
// 찜 목록 추가 부분
let list = document.getElementById("wishList");

// 찜한 영화 목록 배열명 상수로 저장
const MOVIE_ARR = "database";
// 찜한 영화 목록을 저장할 배열
let database = [];

// 찜 버튼을 누르면 발생하는 이벤트
// handler 호출
pickButton.forEach(function (element) {
    element.addEventListener("click", handler);
})

// 버튼을 누르면
// 이미 추가한 영화가 아니면
// 내용을 출력하고
// 배열에 데이터 저장
function handler() {
    // 클릭한 버튼의 아이디를 불러와 영화 정보 리스트의 아이디로 변경
    let id = this.id + "Info";
    // 해당 영화 정보 리스트의 내용을 저장
    let info = "\n" + document.getElementById(id).innerText + "\n";
    // 이미 추가한 영화인지 여부 저장
    let isExist = false;

    // 이미 추가된 영화의 아이디인지 조회
    database.forEach(function (movie) {
        if (movie.id == id) {
            isExist = true;
        }
    });

    // 이미 찜한 영화면 추가 안함
    // isExist 논리형 변수를 제거하면 이미 추가한 영화도 저장 및 출력 가능
    if (!isExist) {
        let span = document.createElement("span");
        span.innerText = info;

        list.appendChild(span);

        const movieObject = {
            id: id,
            movieInfo: info,
        }
        database.push(movieObject);
    }

    // 내용 저장
    saveData();
}

// 데이터 저장 함수
function saveData() {
    localStorage.setItem(MOVIE_ARR, JSON.stringify(database));
}

// 데이터 불러오고 출력하는 함수
function loadData() {
    // 데이터 조회
    const loadData = localStorage.getItem(MOVIE_ARR);

    // 빈 데이터가 아니면 객체로 전환하고
    // 화면에 해당 내용 출력
    if (loadData !== null) {
        let loadArr = JSON.parse(loadData);
        database = loadArr;

        loadArr.forEach(function (movie) {
            let span = document.createElement("span");
            span.innerText = movie.movieInfo;
            list.appendChild(span);
        });
    }
}

loadData();
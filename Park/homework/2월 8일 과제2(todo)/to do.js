// 추가하기 버튼
let addBtn = document.getElementById("addBtn");
// 입력한 작업 내용
let addToDo = document.getElementById("addToDo");
// 작업 목록 리스트
let toDoList = document.getElementById("toDoList");

// ul 태그
let ul = document.querySelector('ul');

// 작업 리스트를 저장한 배열명을 상수로 저장
const WORK_ARRAY = "database";
// 작업 리스트를 저장할 배열 생성
let database = [];

// 추가하기 버튼 누를 시 이벤트
addBtn.addEventListener("click", addWork);

// 입력 값 유효성 검사
function addWork(event) {
    let newWork = document.getElementById("addToDo");

    if (newWork.value !== '') {
        addList(newWork.value); // 빈 값이 아니면 추가 함수로 이동
        newWork.value = ''; // 입력한 값 지우기
    } else {
        alert('작업을 입력해야 추가할 수 있습니다.'); // 빈 칸인 상태로 버튼을 누르면 메시지 출력
    }
}

// 작업 추가
function addList(value) {
    // li 태그 추가
    let li = document.createElement('li');
    // 삭제하기 버튼 추가
    let removeBtn = document.createElement("button");
    // 입력한 내용 적을 span 태그 추가
    let span = document.createElement("span");
    // 아이디 매기기
    let id = database.length + 1;

    // 삭제 버튼에 입력할 글자
    removeBtn.innerText = "할 일 지우기";
    // 삭제 버튼 누를 시 동작할 이벤트
    removeBtn.addEventListener('click', removeWork);

    // 입력한 내용 span 태그에 넣기
    span.innerText = value;

    // li 태그에 span 추가하고
    li.appendChild(span);
    // 삭제 버튼 추가하고
    li.appendChild(removeBtn);
    // id 속성 설정하고
    li.id = id;

    // ul 태그에 추가
    toDoList.appendChild(li);

    // 객체 생성한 후
    // 객체에 아이디와 입력 값을 저장하고
    const toDoObject = {
        id: id,
        value,
    }
    // 데이터 베이스 배열에 클래스 내용 입력
    database.push(toDoObject);
    // 데이터 저장 함수 실행
    saveData();
}

// 데이터 저장 함수
function saveData(){
    // 현재 배열 내용을 JSON으로 변환한 후
    // 로컬 저장소에 입력
    localStorage.setItem(WORK_ARRAY, JSON.stringify(database));
}

// 작업 삭제 함수
function removeWork(event){
    // 누른 삭제 버튼
    let removeBtn = event.target;
    // 버튼이 속한 li 태그
    let li = removeBtn.parentNode;

    // li 태그를 ul 태그에서 삭제
    toDoList.removeChild(li);

    // 삭제한 작업의 아이디를 제외한 작업을 배열에 저장
    const remainArr = database.filter(function (work) {
        return work.id !== parseInt(li.id);
    })

    // 삭제 완료한 배열을 데이터 베이스에 저장
    database = remainArr;

    // 데이터 저장 함수 실행
    saveData();
}

// 로컬 저장소에 저장된 데이터 불러오는 함수
function loadData(){
    // 로컬 저장소에서 database라는 이름으로 저장된 배열 가져오기
    const loadData = localStorage.getItem(WORK_ARRAY);

    // 배열이 비어있지 않으면
    // 로컬 저장소 내용을 객체로 변환하여
    if (loadData !== null){
        let loadArr = JSON.parse(loadData); // 배열에 저장한 후

        // 데이터를 추가하는 함수를 활용하여
        // 화면에 출력시키기
        loadArr.forEach(function (work){
            addList(work.value);
        });
    }
}

// 로컬 저장소 값을 불러오는 함수는 바로 시작하기
loadData();
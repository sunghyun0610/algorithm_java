# [level 3] 조회수가 가장 많은 중고거래 게시판의 첨부파일 조회하기 - 164671 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/164671) 

### 성능 요약

메모리: undefined, 시간: 

### 구분

코딩테스트 연습 > String， Date

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2026년 11월 05일 13:48:39

### 문제 설명

<p style="user-select: auto !important;">다음은 중고거래 게시판 정보를 담은 <code style="user-select: auto !important;">USED_GOODS_BOARD</code> 테이블과 중고거래 게시판 첨부파일 정보를 담은 <code style="user-select: auto !important;">USED_GOODS_FILE</code> 테이블입니다. <code style="user-select: auto !important;">USED_GOODS_BOARD</code> 테이블은 다음과 같으며 <code style="user-select: auto !important;">BOARD_ID</code>, <code style="user-select: auto !important;">WRITER_ID</code>, <code style="user-select: auto !important;">TITLE</code>, <code style="user-select: auto !important;">CONTENTS</code>, <code style="user-select: auto !important;">PRICE</code>, <code style="user-select: auto !important;">CREATED_DATE</code>, <code style="user-select: auto !important;">STATUS</code>, <code style="user-select: auto !important;">VIEWS</code>은 게시글 ID, 작성자 ID, 게시글 제목, 게시글 내용, 가격, 작성일, 거래상태, 조회수를 의미합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">Column name</th>
<th style="user-select: auto !important;">Type</th>
<th style="user-select: auto !important;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">BOARD_ID</td>
<td style="user-select: auto !important;">VARCHAR(5)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">WRITER_ID</td>
<td style="user-select: auto !important;">VARCHAR(50)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">TITLE</td>
<td style="user-select: auto !important;">VARCHAR(100)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">CONTENTS</td>
<td style="user-select: auto !important;">VARCHAR(1000)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PRICE</td>
<td style="user-select: auto !important;">NUMBER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">CREATED_DATE</td>
<td style="user-select: auto !important;">DATE</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">STATUS</td>
<td style="user-select: auto !important;">VARCHAR(10)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">VIEWS</td>
<td style="user-select: auto !important;">NUMBER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;"><code style="user-select: auto !important;">USED_GOODS_FILE</code> 테이블은 다음과 같으며 <code style="user-select: auto !important;">FILE_ID</code>, <code style="user-select: auto !important;">FILE_EXT</code>, <code style="user-select: auto !important;">FILE_NAME</code>, <code style="user-select: auto !important;">BOARD_ID</code>는 각각 파일 ID, 파일 확장자, 파일 이름, 게시글 ID를 의미합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">Column name</th>
<th style="user-select: auto !important;">Type</th>
<th style="user-select: auto !important;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">FILE_ID</td>
<td style="user-select: auto !important;">VARCHAR(10)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">FILE_EXT</td>
<td style="user-select: auto !important;">VARCHAR(5)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">FILE_NAME</td>
<td style="user-select: auto !important;">VARCHAR(256)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">BOARD_ID</td>
<td style="user-select: auto !important;">VARCHAR(10)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">문제</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">USED_GOODS_BOARD</code>와 <code style="user-select: auto !important;">USED_GOODS_FILE</code> 테이블에서 조회수가 가장 높은 중고거래 게시물에 대한 첨부파일 경로를 조회하는  SQL문을 작성해주세요. 첨부파일 경로는 FILE ID를 기준으로 내림차순 정렬해주세요. 기본적인 파일경로는 /home/grep/src/ 이며, 게시글 ID를 기준으로 디렉토리가 구분되고, 파일이름은 파일 ID, 파일 이름, 파일 확장자로 구성되도록 출력해주세요. 조회수가 가장 높은 게시물은 하나만 존재합니다.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">예시</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">USED_GOODS_BOARD</code> 테이블이 다음과 같고</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">BOARD_ID</th>
<th style="user-select: auto !important;">WRITER_ID</th>
<th style="user-select: auto !important;">TITLE</th>
<th style="user-select: auto !important;">CONTENTS</th>
<th style="user-select: auto !important;">PRICE</th>
<th style="user-select: auto !important;">CREATED_DATE</th>
<th style="user-select: auto !important;">STATUS</th>
<th style="user-select: auto !important;">VIEWS</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">B0001</td>
<td style="user-select: auto !important;">kwag98</td>
<td style="user-select: auto !important;">반려견 배변패드 팝니다</td>
<td style="user-select: auto !important;">정말 저렴히 판매합니다. 전부 미개봉 새상품입니다.</td>
<td style="user-select: auto !important;">12000</td>
<td style="user-select: auto !important;">2022-10-01</td>
<td style="user-select: auto !important;">DONE</td>
<td style="user-select: auto !important;">250</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">B0002</td>
<td style="user-select: auto !important;">lee871201</td>
<td style="user-select: auto !important;">국내산 볶음참깨</td>
<td style="user-select: auto !important;">직접 농사지은 참깨입니다.</td>
<td style="user-select: auto !important;">3000</td>
<td style="user-select: auto !important;">2022-10-02</td>
<td style="user-select: auto !important;">DONE</td>
<td style="user-select: auto !important;">121</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">B0003</td>
<td style="user-select: auto !important;">goung12</td>
<td style="user-select: auto !important;">배드민턴 라켓</td>
<td style="user-select: auto !important;">사놓고 방치만 해서 팝니다.</td>
<td style="user-select: auto !important;">9000</td>
<td style="user-select: auto !important;">2022-10-02</td>
<td style="user-select: auto !important;">SALE</td>
<td style="user-select: auto !important;">212</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">B0004</td>
<td style="user-select: auto !important;">keel1990</td>
<td style="user-select: auto !important;">디올 귀걸이</td>
<td style="user-select: auto !important;">신세계강남점에서 구입. 정품 아닐시 백퍼센트 환불</td>
<td style="user-select: auto !important;">130000</td>
<td style="user-select: auto !important;">2022-10-02</td>
<td style="user-select: auto !important;">SALE</td>
<td style="user-select: auto !important;">199</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">B0005</td>
<td style="user-select: auto !important;">haphli01</td>
<td style="user-select: auto !important;">스팸클래식 팔아요</td>
<td style="user-select: auto !important;">유통기한 2025년까지에요</td>
<td style="user-select: auto !important;">10000</td>
<td style="user-select: auto !important;">2022-10-02</td>
<td style="user-select: auto !important;">SALE</td>
<td style="user-select: auto !important;">121</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;"><code style="user-select: auto !important;">USED_GOODS_FILE</code> 테이블이 다음과 같을 때</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">FILE_ID</th>
<th style="user-select: auto !important;">FILE_EXT</th>
<th style="user-select: auto !important;">FILE_NAME</th>
<th style="user-select: auto !important;">BOARD_ID</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">IMG_000001</td>
<td style="user-select: auto !important;">.jpg</td>
<td style="user-select: auto !important;">photo1</td>
<td style="user-select: auto !important;">B0001</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">IMG_000002</td>
<td style="user-select: auto !important;">.jpg</td>
<td style="user-select: auto !important;">photo2</td>
<td style="user-select: auto !important;">B0001</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">IMG_000003</td>
<td style="user-select: auto !important;">.png</td>
<td style="user-select: auto !important;">사진</td>
<td style="user-select: auto !important;">B0002</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">IMG_000004</td>
<td style="user-select: auto !important;">.jpg</td>
<td style="user-select: auto !important;">사진</td>
<td style="user-select: auto !important;">B0003</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">IMG_000005</td>
<td style="user-select: auto !important;">.jpg</td>
<td style="user-select: auto !important;">photo</td>
<td style="user-select: auto !important;">B0004</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">SQL을 실행하면 다음과 같이 출력되어야 합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">FILE_PATH</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">/home/grep/src/B0001/IMG_000001photo1.jpg</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">/home/grep/src/B0001/IMG_000002photo2.jpg</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
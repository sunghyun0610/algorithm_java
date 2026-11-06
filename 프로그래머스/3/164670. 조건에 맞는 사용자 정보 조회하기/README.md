# [level 3] 조건에 맞는 사용자 정보 조회하기 - 164670 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/164670) 

### 성능 요약

메모리: undefined, 시간: 

### 구분

코딩테스트 연습 > String， Date

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2026년 11월 06일 11:36:53

### 문제 설명

<p style="user-select: auto !important;">다음은 중고 거래 게시판 정보를 담은 <code style="user-select: auto !important;">USED_GOODS_BOARD</code> 테이블과 중고 거래 게시판 첨부파일 정보를 담은 <code style="user-select: auto !important;">USED_GOODS_USER</code> 테이블입니다. <code style="user-select: auto !important;">USED_GOODS_BOARD</code> 테이블은 다음과 같으며 <code style="user-select: auto !important;">BOARD_ID</code>, <code style="user-select: auto !important;">WRITER_ID</code>, <code style="user-select: auto !important;">TITLE</code>, <code style="user-select: auto !important;">CONTENTS</code>, <code style="user-select: auto !important;">PRICE</code>, <code style="user-select: auto !important;">CREATED_DATE</code>, <code style="user-select: auto !important;">STATUS</code>, <code style="user-select: auto !important;">VIEWS</code>는 게시글 ID, 작성자 ID, 게시글 제목, 게시글 내용, 가격, 작성일, 거래상태, 조회수를 의미합니다.</p>
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
<p style="user-select: auto !important;"><code style="user-select: auto !important;">USED_GOODS_USER</code> 테이블은 다음과 같으며 <code style="user-select: auto !important;">USER_ID</code>, <code style="user-select: auto !important;">NICKNAME</code>, <code style="user-select: auto !important;">CITY</code>, <code style="user-select: auto !important;">STREET_ADDRESS1</code>, <code style="user-select: auto !important;">STREET_ADDRESS2</code>, <code style="user-select: auto !important;">TLNO</code>는 각각 회원 ID, 닉네임, 시, 도로명 주소, 상세 주소, 전화번호를 의미합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">Column name</th>
<th style="user-select: auto !important;">Type</th>
<th style="user-select: auto !important;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">USER_ID</td>
<td style="user-select: auto !important;">VARCHAR(50)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">NICKANME</td>
<td style="user-select: auto !important;">VARCHAR(100)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">CITY</td>
<td style="user-select: auto !important;">VARCHAR(100)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">STREET_ADDRESS1</td>
<td style="user-select: auto !important;">VARCHAR(100)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">STREET_ADDRESS2</td>
<td style="user-select: auto !important;">VARCHAR(100)</td>
<td style="user-select: auto !important;">TRUE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">TLNO</td>
<td style="user-select: auto !important;">VARCHAR(20)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">문제</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">USED_GOODS_BOARD</code>와 <code style="user-select: auto !important;">USED_GOODS_USER</code> 테이블에서 중고 거래 게시물을 3건 이상 등록한 사용자의 사용자 ID, 닉네임, 전체주소, 전화번호를 조회하는 SQL문을 작성해주세요. 이때, 전체 주소는 시, 도로명 주소, 상세 주소가 함께 출력되도록 해주시고, 전화번호의 경우 xxx-xxxx-xxxx 같은 형태로 하이픈 문자열(<code style="user-select: auto !important;">-</code>)을 삽입하여 출력해주세요. 결과는 회원 ID를 기준으로 내림차순 정렬해주세요. </p>

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
<td style="user-select: auto !important;">dhfkzmf09</td>
<td style="user-select: auto !important;">칼라거펠트 코트</td>
<td style="user-select: auto !important;">양모 70%이상 코트입니다.</td>
<td style="user-select: auto !important;">120000</td>
<td style="user-select: auto !important;">2022-10-14</td>
<td style="user-select: auto !important;">DONE</td>
<td style="user-select: auto !important;">104</td>
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
<td style="user-select: auto !important;">dhfkzmf09</td>
<td style="user-select: auto !important;">나이키 숏패팅</td>
<td style="user-select: auto !important;">사이즈는 M입니다.</td>
<td style="user-select: auto !important;">40000</td>
<td style="user-select: auto !important;">2022-10-17</td>
<td style="user-select: auto !important;">DONE</td>
<td style="user-select: auto !important;">98</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">B0004</td>
<td style="user-select: auto !important;">kwag98</td>
<td style="user-select: auto !important;">반려견 배변패드 팝니다</td>
<td style="user-select: auto !important;">정말 저렴히 판매합니다. 전부 미개봉 새상품입니다.</td>
<td style="user-select: auto !important;">12000</td>
<td style="user-select: auto !important;">2022-10-01</td>
<td style="user-select: auto !important;">DONE</td>
<td style="user-select: auto !important;">250</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">B0005</td>
<td style="user-select: auto !important;">dhfkzmf09</td>
<td style="user-select: auto !important;">PS4</td>
<td style="user-select: auto !important;">PS5 구매로인해 팝니다.</td>
<td style="user-select: auto !important;">250000</td>
<td style="user-select: auto !important;">2022-11-03</td>
<td style="user-select: auto !important;">DONE</td>
<td style="user-select: auto !important;">111</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;"><code style="user-select: auto !important;">USED_GOODS_USER</code> 테이블이 다음과 같을 때</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">USER_ID</th>
<th style="user-select: auto !important;">NICKNAME</th>
<th style="user-select: auto !important;">CITY</th>
<th style="user-select: auto !important;">STREET_ADDRESS1</th>
<th style="user-select: auto !important;">STREET_ADDRESS2</th>
<th style="user-select: auto !important;">TLNO</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">dhfkzmf09</td>
<td style="user-select: auto !important;">찐찐</td>
<td style="user-select: auto !important;">성남시</td>
<td style="user-select: auto !important;">분당구 수내로 13</td>
<td style="user-select: auto !important;">A동 1107호</td>
<td style="user-select: auto !important;">01053422914</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">dlPcks90</td>
<td style="user-select: auto !important;">썹썹</td>
<td style="user-select: auto !important;">성남시</td>
<td style="user-select: auto !important;">분당구 수내로 74</td>
<td style="user-select: auto !important;">401호</td>
<td style="user-select: auto !important;">01034573944</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">cjfwls91</td>
<td style="user-select: auto !important;">점심만금식</td>
<td style="user-select: auto !important;">성남시</td>
<td style="user-select: auto !important;">분당구 내정로 185</td>
<td style="user-select: auto !important;">501호</td>
<td style="user-select: auto !important;">01036344964</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">dlfghks94</td>
<td style="user-select: auto !important;">희망</td>
<td style="user-select: auto !important;">성남시</td>
<td style="user-select: auto !important;">분당구 내정로 101</td>
<td style="user-select: auto !important;">203동 102호</td>
<td style="user-select: auto !important;">01032634154</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">rkdhs95</td>
<td style="user-select: auto !important;">용기</td>
<td style="user-select: auto !important;">성남시</td>
<td style="user-select: auto !important;">분당구 수내로 23</td>
<td style="user-select: auto !important;">501호</td>
<td style="user-select: auto !important;">01074564564</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">SQL을 실행하면 다음과 같이 출력되어야 합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">USER_ID</th>
<th style="user-select: auto !important;">NICKNAME</th>
<th style="user-select: auto !important;">전체주소</th>
<th style="user-select: auto !important;">전화번호</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">dhfkzmf09</td>
<td style="user-select: auto !important;">찐찐</td>
<td style="user-select: auto !important;">성남시 분당구 수내로 13 A동 1107호</td>
<td style="user-select: auto !important;">010-5342-2914</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
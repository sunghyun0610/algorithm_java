# [level 1] 조건에 맞는 도서 리스트 출력하기 - 144853 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/144853) 

### 성능 요약

메모리: undefined, 시간: 

### 구분

코딩테스트 연습 > SELECT

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2026년 10월 02일 21:11:06

### 문제 설명

<p style="user-select: auto !important;">다음은 어느 한 서점에서 판매중인 도서들의 도서 정보(<code style="user-select: auto !important;">BOOK</code>) 테이블입니다.</p>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">BOOK</code> 테이블은 각 도서의 정보를 담은 테이블로 아래와 같은 구조로 되어있습니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">Column name</th>
<th style="user-select: auto !important;">Type</th>
<th style="user-select: auto !important;">Nullable</th>
<th style="user-select: auto !important;">Description</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">BOOK_ID</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">FALSE</td>
<td style="user-select: auto !important;">도서 ID</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">CATEGORY</td>
<td style="user-select: auto !important;">VARCHAR(N)</td>
<td style="user-select: auto !important;">FALSE</td>
<td style="user-select: auto !important;">카테고리 (경제, 인문, 소설, 생활, 기술)</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">AUTHOR_ID</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">FALSE</td>
<td style="user-select: auto !important;">저자 ID</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PRICE</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">FALSE</td>
<td style="user-select: auto !important;">판매가 (원)</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PUBLISHED_DATE</td>
<td style="user-select: auto !important;">DATE</td>
<td style="user-select: auto !important;">FALSE</td>
<td style="user-select: auto !important;">출판일</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">문제</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">BOOK</code> 테이블에서 <code style="user-select: auto !important;">2021년</code>에 출판된 <code style="user-select: auto !important;">'인문'</code> 카테고리에 속하는 도서 리스트를 찾아서 도서 ID(<code style="user-select: auto !important;">BOOK_ID</code>), 출판일 (<code style="user-select: auto !important;">PUBLISHED_DATE</code>)을 출력하는 SQL문을 작성해주세요. <br style="user-select: auto !important;">
결과는 출판일을 기준으로 오름차순 정렬해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">예시</h5>

<p style="user-select: auto !important;">예를 들어 <code style="user-select: auto !important;">BOOK</code> 테이블이 다음과 같다면</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">BOOK_ID</th>
<th style="user-select: auto !important;">CATEGORY</th>
<th style="user-select: auto !important;">AUTHOR_ID</th>
<th style="user-select: auto !important;">PRICE</th>
<th style="user-select: auto !important;">PUBLISHED_DATE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">인문</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">10000</td>
<td style="user-select: auto !important;">2020-01-01</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">경제</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">9000</td>
<td style="user-select: auto !important;">2021-02-05</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">인문</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">11000</td>
<td style="user-select: auto !important;">2021-04-11</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">인문</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">10000</td>
<td style="user-select: auto !important;">2021-03-15</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">생활</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">12000</td>
<td style="user-select: auto !important;">2021-01-10</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">조건에 속하는 도서는 도서 ID 가 3, 4인 도서이므로 다음과 같습니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">BOOK_ID</th>
<th style="user-select: auto !important;">PUBLISHED_DATE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">2021-04-11</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">2021-03-15</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">그리고 출판일 오름차순으로 정렬하여야 하므로 다음과 같은 결과가 나와야 합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">BOOK_ID</th>
<th style="user-select: auto !important;">PUBLISHED_DATE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">2021-03-15</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">2021-04-11</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">주의사항</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">PUBLISHED_DATE</code>의 데이트 포맷이 예시와 동일해야 정답처리 됩니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
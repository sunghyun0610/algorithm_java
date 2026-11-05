# [level 2] 숫자 변환하기 - 154538 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/154538) 

### 성능 요약

메모리: 120 MB, 시간: 76.57 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 11월 05일 09:49:25

### 문제 설명

<p style="user-select: auto !important;">자연수 <code style="user-select: auto !important;">x</code>를 <code style="user-select: auto !important;">y</code>로 변환하려고 합니다. 사용할 수 있는 연산은 다음과 같습니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">x</code>에 <code style="user-select: auto !important;">n</code>을 더합니다</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">x</code>에 2를 곱합니다.</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">x</code>에 3을 곱합니다.</li>
</ul>

<p style="user-select: auto !important;">자연수 <code style="user-select: auto !important;">x</code>, <code style="user-select: auto !important;">y</code>, <code style="user-select: auto !important;">n</code>이 매개변수로 주어질 때, <code style="user-select: auto !important;">x</code>를 <code style="user-select: auto !important;">y</code>로 변환하기 위해 필요한 최소 연산 횟수를 return하도록 solution 함수를 완성해주세요. 이때 <code style="user-select: auto !important;">x</code>를 <code style="user-select: auto !important;">y</code>로 만들 수 없다면 -1을 return 해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1&nbsp;≤&nbsp;<code style="user-select: auto !important;">x</code> ≤ <code style="user-select: auto !important;">y</code>&nbsp;≤ 1,000,000</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">n</code> &lt; <code style="user-select: auto !important;">y</code></li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">x</th>
<th style="user-select: auto !important;">y</th>
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">40</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">2</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">40</td>
<td style="user-select: auto !important;">30</td>
<td style="user-select: auto !important;">1</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">-1</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1<br style="user-select: auto !important;">
<code style="user-select: auto !important;">x</code>에 2를 2번 곱하면 40이 되고 이때가 최소 횟수입니다.</p>

<p style="user-select: auto !important;">입출력 예 #2<br style="user-select: auto !important;">
<code style="user-select: auto !important;">x</code>에 <code style="user-select: auto !important;">n</code>인 30을 1번 더하면 40이 되고 이때가 최소 횟수입니다.</p>

<p style="user-select: auto !important;">입출력 예 #3<br style="user-select: auto !important;">
<code style="user-select: auto !important;">x</code>를 <code style="user-select: auto !important;">y</code>로 변환할 수 없기 때문에 -1을 return합니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
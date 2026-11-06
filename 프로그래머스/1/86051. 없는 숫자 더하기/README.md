# [level 1] 없는 숫자 더하기 - 86051 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/86051) 

### 성능 요약

메모리: 78.1 MB, 시간: 0.06 ms

### 구분

코딩테스트 연습 > 월간 코드 챌린지 시즌3

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 11월 06일 18:42:10

### 문제 설명

<p style="user-select: auto !important;">0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 <code style="user-select: auto !important;">numbers</code>가 매개변수로 주어집니다. <code style="user-select: auto !important;">numbers</code>에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">numbers</code>의 길이 ≤ 9

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">numbers</code>의 모든 원소 ≤ 9</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">numbers</code>의 모든 원소는 서로 다릅니다.</li>
</ul></li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">numbers</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1,2,3,4,6,7,8,0]</td>
<td style="user-select: auto !important;">14</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[5,8,4,0,6,7,9]</td>
<td style="user-select: auto !important;">6</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #1</strong></p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">5, 9가 <code style="user-select: auto !important;">numbers</code>에 없으므로, 5 + 9 = 14를 return 해야 합니다.</li>
</ul>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #2</strong></p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1, 2, 3이 <code style="user-select: auto !important;">numbers</code>에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
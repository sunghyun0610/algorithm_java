# [level 1] 소수 만들기 - 12977 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12977) 

### 성능 요약

메모리: 81.6 MB, 시간: 1.10 ms

### 구분

코딩테스트 연습 > Summer／Winter Coding（～2018）

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 11월 06일 16:49:52

### 문제 설명

<p style="user-select: auto !important;">주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.</p>

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.</li>
<li style="user-select: auto !important;">nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">nums</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1,2,3,4]</td>
<td style="user-select: auto !important;">1</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1,2,7,6,4]</td>
<td style="user-select: auto !important;">4</td>
</tr>
</tbody>
      </table>
<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1<br style="user-select: auto !important;">
[1,2,4]를 이용해서 7을 만들 수 있습니다.</p>

<p style="user-select: auto !important;">입출력 예 #2<br style="user-select: auto !important;">
[1,2,4]를 이용해서 7을 만들 수 있습니다.<br style="user-select: auto !important;">
[1,4,6]을 이용해서 11을 만들 수 있습니다.<br style="user-select: auto !important;">
[2,4,7]을 이용해서 13을 만들 수 있습니다.<br style="user-select: auto !important;">
[4,6,7]을 이용해서 17을 만들 수 있습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
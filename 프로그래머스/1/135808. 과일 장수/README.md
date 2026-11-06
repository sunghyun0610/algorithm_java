# [level 1] 과일 장수 - 135808 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/135808) 

### 성능 요약

메모리: 113 MB, 시간: 30.62 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 11월 06일 21:24:29

### 문제 설명

<p style="user-select: auto !important;">과일 장수가 사과 상자를 포장하고 있습니다. 사과는 상태에 따라 1점부터 k점까지의 점수로 분류하며, k점이 최상품의 사과이고 1점이 최하품의 사과입니다. 사과 한 상자의 가격은 다음과 같이 결정됩니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">한 상자에 사과를 m개씩 담아 포장합니다.</li>
<li style="user-select: auto !important;">상자에 담긴 사과 중 가장 낮은 점수가 p (1 ≤ p ≤ k)점인 경우, 사과 한 상자의 가격은 p * m 입니다.</li>
</ul>

<p style="user-select: auto !important;">과일 장수가 가능한 많은 사과를 팔았을 때, 얻을 수 있는 최대 이익을 계산하고자 합니다.(사과는 상자 단위로만 판매하며, 남는 사과는 버립니다)</p>

<p style="user-select: auto !important;">예를 들어, <code style="user-select: auto !important;">k</code> = 3, <code style="user-select: auto !important;">m</code> = 4, 사과 7개의 점수가 [1, 2, 3, 1, 2, 3, 1]이라면, 다음과 같이 [2, 3, 2, 3]으로 구성된 사과 상자 1개를 만들어 판매하여 최대 이익을 얻을 수 있습니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">(최저 사과 점수) x (한 상자에 담긴 사과 개수) x (상자의 개수) = 2 x 4 x 1 = 8</li>
</ul>

<p style="user-select: auto !important;">사과의 최대 점수 <code style="user-select: auto !important;">k</code>, 한 상자에 들어가는 사과의 수 <code style="user-select: auto !important;">m</code>, 사과들의 점수 <code style="user-select: auto !important;">score</code>가 주어졌을 때, 과일 장수가 얻을 수 있는 최대 이익을 return하는 solution 함수를 완성해주세요.</p>

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">3 ≤ <code style="user-select: auto !important;">k</code> ≤ 9</li>
<li style="user-select: auto !important;">3 ≤ <code style="user-select: auto !important;">m</code> ≤ 10</li>
<li style="user-select: auto !important;">7 ≤ <code style="user-select: auto !important;">score</code>의 길이 ≤ 1,000,000

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">score[i]</code> ≤ k</li>
</ul></li>
<li style="user-select: auto !important;">이익이 발생하지 않는 경우에는 0을 return 해주세요.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">k</th>
<th style="user-select: auto !important;">m</th>
<th style="user-select: auto !important;">score</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">[1, 2, 3, 1, 2, 3, 1]</td>
<td style="user-select: auto !important;">8</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">[4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]</td>
<td style="user-select: auto !important;">33</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #1</strong></p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">문제의 예시와 같습니다.</li>
</ul>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #2</strong></p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">다음과 같이 사과 상자를 포장하여 모두 팔면 최대 이익을 낼 수 있습니다.</li>
</ul>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">사과 상자</th>
<th style="user-select: auto !important;">가격</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1, 1, 2]</td>
<td style="user-select: auto !important;">1 x 3 = 3</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[2, 2, 2]</td>
<td style="user-select: auto !important;">2 x 3 = 6</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[4, 4, 4]</td>
<td style="user-select: auto !important;">4 x 3 = 12</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[4, 4, 4]</td>
<td style="user-select: auto !important;">4 x 3 = 12</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">따라서 (1 x 3 x 1) + (2 x 3 x 1) + (4 x 3 x 2) = 33을 return합니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
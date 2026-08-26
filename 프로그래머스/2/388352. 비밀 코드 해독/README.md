# [level 2] 비밀 코드 해독 - 388352 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/388352) 

### 성능 요약

메모리: 87.3 MB, 시간: 5108.84 ms

### 구분

코딩테스트 연습 > 2025 프로그래머스 코드챌린지 1차 예선

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 08월 26일 21:35:48

### 문제 설명

<p style="user-select: auto !important;">당신은 비밀 조직의 보안 시스템을 뚫고 중요한 정보를 해독해야 합니다. 시스템은 1부터 <code style="user-select: auto !important;">n</code>까지의 서로 다른 정수 5개가 오름차순으로 정렬된 비밀 코드를 가지고 있으며, 당신은 이 비밀 코드를 맞혀야 합니다. </p>

<p style="user-select: auto !important;">당신은 비밀 코드를 알아내기 위해 암호 분석 도구를 사용하며, <code style="user-select: auto !important;">m</code>번의 시도를 할 수 있습니다. 각 시도마다 서로 다른 5개의 정수를 입력하면, 시스템은 그 중 몇 개가 비밀 코드에 포함되어 있는지 알려줍니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">만약 비밀 코드가 [3, 5, 7, 9, 10]이고, 입력한 정수가 [1, 2, 3, 4, 5]라면 비밀 코드에 포함된 정수는 3, 5 두 개이므로 시스템은 2를 응답합니다.</li>
</ul>

<p style="user-select: auto !important;">당신은 <code style="user-select: auto !important;">m</code>번의 시도 후, 비밀 코드로 가능한 정수 조합의 개수를 알고 싶습니다.</p>

<p style="user-select: auto !important;">비밀 코드에 사용된 정수의 범위가 1~10일 때, 아래와 같이 5번의 시도를 했다고 가정해 보겠습니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">입력한 정수</th>
<th style="user-select: auto !important;">시스템 응답(일치하는 개수)</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1, 2, 3, 4, 5]</td>
<td style="user-select: auto !important;">2개</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[6, 7, 8, 9, 10]</td>
<td style="user-select: auto !important;">3개</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[3, 7, 8, 9, 10]</td>
<td style="user-select: auto !important;">4개</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[2, 5, 7, 9, 10]</td>
<td style="user-select: auto !important;">3개</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[3, 4, 5, 6, 7]</td>
<td style="user-select: auto !important;">3개</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">비밀 코드로 가능한 정수 조합은 아래와 같이 3개가 있습니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">[3, 4, 7, 9, 10]

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">첫 번째 시도에서 비밀 코드에 포함된 정수가 3, 4로 2개 있습니다.</li>
<li style="user-select: auto !important;">두 번째 시도에서 비밀 코드에 포함된 정수가 7, 9, 10으로 3개 있습니다.</li>
<li style="user-select: auto !important;">세 번째 시도에서 비밀 코드에 포함된 정수가 3, 7, 9, 10으로 4개 있습니다.</li>
<li style="user-select: auto !important;">네 번째 시도에서 비밀 코드에 포함된 정수가 7, 9, 10으로 3개 있습니다.</li>
<li style="user-select: auto !important;">다섯 번째 시도에서 비밀 코드에 포함된 정수가 3, 4, 7로 3개 있습니다.</li>
</ul></li>
<li style="user-select: auto !important;">[3, 5, 7, 8, 9]

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">첫 번째 시도에서 비밀 코드에 포함된 정수가 3, 5로 2개 있습니다.</li>
<li style="user-select: auto !important;">두 번째 시도에서 비밀 코드에 포함된 정수가 7, 8, 9로 3개 있습니다.</li>
<li style="user-select: auto !important;">세 번째 시도에서 비밀 코드에 포함된 정수가 3, 7, 8, 9로 4개 있습니다.</li>
<li style="user-select: auto !important;">네 번째 시도에서 비밀 코드에 포함된 정수가 5, 7, 9로 3개 있습니다.</li>
<li style="user-select: auto !important;">다섯 번째 시도에서 비밀 코드에 포함된 정수가 3, 5, 7로 3개 있습니다.</li>
</ul></li>
<li style="user-select: auto !important;">[3, 5, 7, 8, 10]

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">첫 번째 시도에서 비밀 코드에 포함된 정수가 3, 5로 2개 있습니다.</li>
<li style="user-select: auto !important;">두 번째 시도에서 비밀 코드에 포함된 정수가 7, 8, 10으로 3개 있습니다.</li>
<li style="user-select: auto !important;">세 번째 시도에서 비밀 코드에 포함된 정수가 3, 7, 8, 10으로 4개 있습니다.</li>
<li style="user-select: auto !important;">네 번째 시도에서 비밀 코드에 포함된 정수가 5, 7, 10으로 3개 있습니다.</li>
<li style="user-select: auto !important;">다섯 번째 시도에서 비밀 코드에 포함된 정수가 3, 5, 7로 3개 있습니다.</li>
</ul></li>
</ul>

<p style="user-select: auto !important;">정수 <code style="user-select: auto !important;">n</code>, 입력한 정수를 담은 2차원 정수 배열 <code style="user-select: auto !important;">q</code>와 시스템 응답을 담은 1차원 정수 배열 <code style="user-select: auto !important;">ans</code>가 매개변수로 주어집니다. 이때, 비밀 코드로 가능한 정수 조합 개수를 return 하도록 solution 함수를 완성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">10 ≤ <code style="user-select: auto !important;">n</code> ≤ 30</li>
<li style="user-select: auto !important;">1 ≤ (<code style="user-select: auto !important;">q</code>의 길이 = <code style="user-select: auto !important;">m</code>) ≤ 10

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">q[i]</code>의 길이 = 5</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">q[i]</code>는 <code style="user-select: auto !important;">i+1</code>번째 시도에서 입력한 5개의 서로 다른 정수를 담고 있으며, 오름차순으로 정렬되어 있습니다.</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">q[i][j]</code> ≤ <code style="user-select: auto !important;">n</code></li>
</ul></li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">ans</code>의 길이 = <code style="user-select: auto !important;">m</code>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">ans[i]</code>는 <code style="user-select: auto !important;">i+1</code>번째 시도에서 입력한 5개의 정수 중 비밀 코드에 포함된 정수의 개수를 나타냅니다.</li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">ans[i]</code> ≤ 5</li>
</ul></li>
<li style="user-select: auto !important;">비밀 코드가 존재하지 않는(답이 0인) 경우는 주어지지 않습니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">테스트 케이스 구성 안내</h5>

<p style="user-select: auto !important;">아래는 테스트 케이스 구성을 나타냅니다. 각 그룹 내의 테스트 케이스를 모두 통과하면 해당 그룹에 할당된 점수를 획득할 수 있습니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">그룹</th>
<th style="user-select: auto !important;">총점</th>
<th style="user-select: auto !important;">추가 제한 사항</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">#1</td>
<td style="user-select: auto !important;">20%</td>
<td style="user-select: auto !important;"><code style="user-select: auto !important;">m</code> = 1</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">#2</td>
<td style="user-select: auto !important;">80%</td>
<td style="user-select: auto !important;">추가 제한 사항 없음</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">q</th>
<th style="user-select: auto !important;">ans</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">[[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [3, 7, 8, 9, 10], [2, 5, 7, 9, 10], [3, 4, 5, 6, 7]]</td>
<td style="user-select: auto !important;">[2, 3, 4, 3, 3]</td>
<td style="user-select: auto !important;">3</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">15</td>
<td style="user-select: auto !important;">[[2, 3, 9, 12, 13], [1, 4, 6, 7, 9], [1, 2, 8, 10, 12], [6, 7, 11, 13, 15], [1, 4, 10, 11, 14]]</td>
<td style="user-select: auto !important;">[2, 1, 3, 0, 1]</td>
<td style="user-select: auto !important;">5</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #1</strong></p>

<p style="user-select: auto !important;">문제 예시와 같습니다.</p>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #2</strong></p>

<p style="user-select: auto !important;">비밀 코드로 가능한 정수 조합은 아래와 같이 5개가 있습니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">[1, 2, 3, 5, 8]</li>
<li style="user-select: auto !important;">[1, 3, 5, 8, 12]</li>
<li style="user-select: auto !important;">[2, 4, 5, 8, 12]</li>
<li style="user-select: auto !important;">[2, 5, 8, 9, 10]</li>
<li style="user-select: auto !important;">[5, 8, 9, 10, 12]</li>
</ul>

<p style="user-select: auto !important;">따라서 5를 return 해야 합니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
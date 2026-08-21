# [level 3] [PCCP 기출문제] 4번 / 수레 움직이기 - 250134 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/250134) 

### 성능 요약

메모리: 83.1 MB, 시간: 6.92 ms

### 구분

코딩테스트 연습 > PCCP 기출문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 08월 21일 17:52:45

### 문제 설명

<p style="user-select: auto !important;"><code style="user-select: auto !important;">n</code> x <code style="user-select: auto !important;">m</code> 크기 격자 모양의 퍼즐판이 주어집니다.</p>

<p style="user-select: auto !important;">퍼즐판에는 빨간색 수레와 파란색 수레가 하나씩 존재합니다. 각 수레들은 자신의 시작 칸에서부터 자신의 도착 칸까지 이동해야 합니다.<br style="user-select: auto !important;">
모든 수레들을 각자의 도착 칸으로 이동시키면 퍼즐을 풀 수 있습니다.</p>

<p style="user-select: auto !important;">당신은 각 턴마다 <strong style="user-select: auto !important;">반드시 모든 수레를 상하좌우로 인접한 칸 중 한 칸으로 움직여야 합니다.</strong> 단, 수레를 움직일 때는 아래와 같은 규칙이 있습니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">수레는 벽이나 격자 판 밖으로 움직일 수 없습니다.</li>
<li style="user-select: auto !important;">수레는 자신이 방문했던 칸으로 움직일 수 없습니다.</li>
<li style="user-select: auto !important;">자신의 도착 칸에 위치한 수레는 <strong style="user-select: auto !important;">움직이지 않습니다.</strong> 계속 해당 칸에 고정해 놓아야 합니다.</li>
<li style="user-select: auto !important;">동시에 두 수레를 같은 칸으로 움직일 수 없습니다.</li>
<li style="user-select: auto !important;">수레끼리 자리를 바꾸며 움직일 수 없습니다.</li>
</ul>

<p style="user-select: auto !important;">예를 들어, 아래 그림처럼 <code style="user-select: auto !important;">n</code> = 3, <code style="user-select: auto !important;">m</code> = 2인 퍼즐판이 있습니다.</p>

<p style="user-select: auto !important;"><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/2d21a258-144f-4d03-81c1-1a857a942efa/rb_horse1.jpg" title="" alt="rb_horse1.jpg" style="user-select: auto !important;"></p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">속이 빨간색인 원은 빨간색 수레를 나타냅니다.</li>
<li style="user-select: auto !important;">속이 파란색인 원은 파란색 수레를 나타냅니다.</li>
<li style="user-select: auto !important;">테두리가 빨간색인 원은 빨간색 수레의 도착 칸을 나타냅니다.</li>
<li style="user-select: auto !important;">테두리가 파란색인 원은 파란색 수레의 도착 칸을 나타냅니다.</li>
</ul>

<p style="user-select: auto !important;">위 퍼즐판은 아래와 같은 순서로 3턴만에 풀 수 있습니다.</p>

<p style="user-select: auto !important;"><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/e1c81aa3-238b-4f0e-b21d-697903543b72/rb_horse2.jpg" title="" alt="rb_horse2.jpg" style="user-select: auto !important;"></p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">빨간색 사선이 처진 칸은 빨간색 수레가 방문했던 칸을 나타냅니다. 규칙에 따라 빨간색 수레는 빨간색 사선이 처진 칸(방문했던 칸)으로는 이동할 수 없습니다.</li>
<li style="user-select: auto !important;">파란색 사선이 처진 칸은 파란색 수레가 방문했던 칸을 나타냅니다. 규칙에 따라 파란색 수레는 파란색 사선이 처진 칸(방문했던 칸)으로는 이동할 수 없습니다.</li>
</ul>

<p style="user-select: auto !important;"><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/2b78f38c-121a-441c-90f9-704eb0642e96/rb_horse3.jpg" title="" alt="rb_horse3.jpg" style="user-select: auto !important;"></p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">위처럼 동시에 수레를 같은 칸으로 움직일 수는 없습니다.</li>
</ul>

<p style="user-select: auto !important;">퍼즐판의 정보를 나타내는 2차원 정수 배열 <code style="user-select: auto !important;">maze</code>가 매개변수로 주어집니다. 퍼즐을 푸는데 필요한 턴의 최솟값을 return 하도록 solution 함수를 완성해 주세요. 퍼즐을 풀 수 없는 경우 0을 return 해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">maze</code>의 길이 (= 세로 길이) ≤ 4

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">maze[i]</code>의 길이 (= 가로 길이) ≤ 4</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">maze[i][j]</code>는 0,1,2,3,4,5 중 하나의 값을 갖습니다.</li>
</ul></li>
</ul>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;"><code style="user-select: auto !important;">maze[i][j]</code></th>
<th style="user-select: auto !important;">의미</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">빈칸</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">빨간 수레의 시작 칸</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">파란 수레의 시작 칸</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">빨간 수레의 도착 칸</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">파란 수레의 도착 칸</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">벽</td>
</tr>
</tbody>
      </table>
<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">빨간 수레의 시작 칸, 빨간 수레의 도착 칸, 파란 수레의 시작 칸, 파란 수레의 도착 칸은 퍼즐판에 1개씩 존재합니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">maze</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[[1, 4], [0, 0], [2, 3]]</td>
<td style="user-select: auto !important;">3</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[[1, 0, 2], [0, 0, 0], [5, 0 ,5], [4, 0, 3]]</td>
<td style="user-select: auto !important;">7</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[[1, 5], [2, 5], [4, 5], [3, 5]]</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[[4, 1, 2, 3]]</td>
<td style="user-select: auto !important;">0</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #1</strong></p>

<p style="user-select: auto !important;">문제 예시와 같습니다.</p>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #2</strong></p>

<p style="user-select: auto !important;"><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/54629429-3bec-4288-a7b4-6303c0929880/rb_horse4.jpg" title="" alt="rb_horse4.jpg" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">7턴만에 퍼즐을 풀 수 있습니다. 다른 방법으로도 퍼즐을 풀 수 있지만 7턴보다 빠르게 풀 수는 없습니다.</p>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #3</strong></p>

<p style="user-select: auto !important;"><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/c6aed2ad-dbbf-477e-bac7-fd5cd44bad00/rb_horse5.jpg" title="" alt="rb_horse5.jpg" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">다음 턴에 파란색 수레가 파란색 수레의 도착 칸에 위치한 후 고정되어 빨간색 수레가 빨간색 수레의 도착 칸에 도착할 수 없게 됩니다.<br style="user-select: auto !important;">
퍼즐을 풀 수 없으므로 0을 return 해야 합니다.</p>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #4</strong></p>

<p style="user-select: auto !important;"><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/0ff7e955-77d6-4760-9e16-75cf2313fc0d/rb_horse6.jpg" title="" alt="rb_horse6.jpg" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">수레는 서로 위치를 바꾸면서 움직일 수 없으므로 퍼즐을 풀 수 없습니다. 따라서 0을 return 해야 합니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
# [level 2] 서버 증설 횟수 - 389479 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/389479) 

### 성능 요약

메모리: 81.9 MB, 시간: 2.26 ms

### 구분

코딩테스트 연습 > 2025 프로그래머스 코드챌린지 2차 예선

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 08월 27일 10:50:17

### 문제 설명

<p style="user-select: auto !important;">당신은 온라인 게임을 운영하고 있습니다. 같은 시간대에 게임을 이용하는 사람이 <code style="user-select: auto !important;">m</code>명 늘어날 때마다 서버 1대가 추가로 필요합니다. 어느 시간대의 이용자가 <code style="user-select: auto !important;">m</code>명 미만이라면, 서버 증설이 필요하지 않습니다. 어느 시간대의 이용자가 <code style="user-select: auto !important;">n x m</code>명 이상 <code style="user-select: auto !important;">(n + 1) x m</code>명 미만이라면 최소 <code style="user-select: auto !important;">n</code>대의 증설된 서버가 운영 중이어야 합니다. 한 번 증설한 서버는 <code style="user-select: auto !important;">k</code>시간 동안 운영하고 그 이후에는 반납합니다. 예를 들어, <code style="user-select: auto !important;">k</code> = 5 일 때 10시에 증설한 서버는 10 ~ 15시에만 운영됩니다.</p>

<p style="user-select: auto !important;">하루 동안 모든 게임 이용자가 게임을 하기 위해 서버를 최소 몇 번 증설해야 하는지 알고 싶습니다. 같은 시간대에 서버를 x대 증설했다면 해당 시간대의 증설 횟수는 x회입니다.</p>

<p style="user-select: auto !important;">다음은 <code style="user-select: auto !important;">m</code> = 3, <code style="user-select: auto !important;">k</code> = 5 일 때의 시간대별 증설된 서버의 수와 증설 횟수 예시입니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">시각</th>
<th style="user-select: auto !important;">게임 이용자의 수</th>
<th style="user-select: auto !important;">증설된 서버의 수</th>
<th style="user-select: auto !important;">증설 횟수</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">0 ~ 1</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1 ~ 2</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2 ~ 3</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">1</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3 ~ 4</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4 ~ 5</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">5 ~ 6</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">6 ~ 7</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">7 ~ 8</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">8 ~ 9</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">9 ~ 10</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">10 ~ 11</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">1</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">11 ~ 12</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">12 ~ 13</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">13 ~ 14</td>
<td style="user-select: auto !important;">6</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">1</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">14 ~ 15</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">15 ~ 16</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">16 ~ 17</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">17 ~ 18</td>
<td style="user-select: auto !important;">13</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">3</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">18 ~ 19</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">19 ~ 20</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">20 ~ 21</td>
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">21 ~ 22</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">22 ~ 23</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">0</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">23 ~ 24</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">1</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">모든 게임 이용자를 감당하기 위해 최소 7번 서버를 증설해야 하며, 이보다 적은 수의 서버 증설로는 모든 게임 이용자를 감당할 수 없습니다.</p>

<p style="user-select: auto !important;">0시에서 23시까지의 시간대별 게임 이용자의 수를 나타내는 1차원 정수 배열 <code style="user-select: auto !important;">players</code>, 서버 한 대로 감당할 수 있는 최대 이용자의 수를 나타내는 정수 <code style="user-select: auto !important;">m</code>, 서버 한 대가 운영 가능한 시간을 나타내는 정수 <code style="user-select: auto !important;">k</code>가 주어집니다. 이때, 모든 게임 이용자를 감당하기 위한 최소 서버 증설 횟수를 return 하도록 solution을 완성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">players</code>의 길이 = 24

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">players</code>의 원소 ≤ 1,000</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">players[i]</code>는 <code style="user-select: auto !important;">i</code>시 ~ <code style="user-select: auto !important;">i+1</code>시 사이의 게임 이용자의 수를 나타냅니다.</li>
</ul></li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">m</code> ≤ 1,000</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">k</code> ≤ 24</li>
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
<td style="user-select: auto !important;">5%</td>
<td style="user-select: auto !important;">m = <code style="user-select: auto !important;">1</code>, k = <code style="user-select: auto !important;">1</code></td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">#2</td>
<td style="user-select: auto !important;">7%</td>
<td style="user-select: auto !important;">k = <code style="user-select: auto !important;">1</code></td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">#3</td>
<td style="user-select: auto !important;">88%</td>
<td style="user-select: auto !important;">추가 제한 사항 없음</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">players</th>
<th style="user-select: auto !important;">m</th>
<th style="user-select: auto !important;">k</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5]</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">7</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[0, 0, 0, 10, 0, 12, 0, 15, 0, 1, 0, 1, 0, 0, 0, 5, 0, 0, 11, 0, 8, 0, 0, 0]</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">11</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1]</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">12</td>
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
<li style="user-select: auto !important;">총 11번 서버를 증설해야 합니다.

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">3 ~ 4시: 2번</li>
<li style="user-select: auto !important;">5 ~ 6시: 2번</li>
<li style="user-select: auto !important;">7 ~ 8시: 3번</li>
<li style="user-select: auto !important;">15 ~ 16시: 1번</li>
<li style="user-select: auto !important;">18 ~ 19시: 2번</li>
<li style="user-select: auto !important;">20 ~ 21시: 1번</li>
</ul></li>
</ul>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #3</strong></p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">총 12번 서버를 증설해야 합니다.

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">5 ~ 6시: 2번</li>
<li style="user-select: auto !important;">9 ~ 10시: 1번</li>
<li style="user-select: auto !important;">11 ~ 12시: 5번</li>
<li style="user-select: auto !important;">13 ~ 14시: 2번</li>
<li style="user-select: auto !important;">15 ~ 16시: 1번</li>
<li style="user-select: auto !important;">23 ~ 24시: 1번</li>
</ul></li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
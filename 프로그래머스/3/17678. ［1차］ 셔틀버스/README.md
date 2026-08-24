# [level 3] [1차] 셔틀버스 - 17678 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/17678) 

### 성능 요약

메모리: 80.5 MB, 시간: 14.03 ms

### 구분

코딩테스트 연습 > 2018 KAKAO BLIND RECRUITMENT

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 08월 24일 18:35:07

### 문제 설명

<h2 style="user-select: auto !important;">셔틀버스</h2>

<p style="user-select: auto !important;">카카오에서는 무료 셔틀버스를 운행하기 때문에 판교역에서 편하게 사무실로 올 수 있다. 카카오의 직원은 서로를 '크루'라고 부르는데, 아침마다 많은 크루들이 이 셔틀을 이용하여 출근한다.</p>

<p style="user-select: auto !important;">이 문제에서는 편의를 위해 셔틀은 다음과 같은 규칙으로 운행한다고 가정하자.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">셔틀은 <code style="user-select: auto !important;">09:00</code>부터 총 <code style="user-select: auto !important;">n</code>회 <code style="user-select: auto !important;">t</code>분 간격으로 역에 도착하며, 하나의 셔틀에는 최대 <code style="user-select: auto !important;">m</code>명의 승객이 탈 수 있다.</li>
<li style="user-select: auto !important;">셔틀은 도착했을 때 도착한 순간에 대기열에 선 크루까지 포함해서 대기 순서대로 태우고 바로 출발한다. 예를 들어 <code style="user-select: auto !important;">09:00</code>에 도착한 셔틀은 자리가 있다면 <code style="user-select: auto !important;">09:00</code>에 줄을 선 크루도 탈 수 있다.</li>
</ul>

<p style="user-select: auto !important;">일찍 나와서 셔틀을 기다리는 것이 귀찮았던 콘은, 일주일간의 집요한 관찰 끝에 어떤 크루가 몇 시에 셔틀 대기열에 도착하는지 알아냈다. 콘이 셔틀을 타고 사무실로 갈 수 있는 도착 시각 중 제일 늦은 시각을 구하여라.</p>

<p style="user-select: auto !important;">단, 콘은 게으르기 때문에 같은 시각에 도착한 크루 중 대기열에서 제일 뒤에 선다. 또한, 모든 크루는 잠을 자야 하므로 <code style="user-select: auto !important;">23:59</code>에 집에 돌아간다. 따라서 어떤 크루도 다음날 셔틀을 타는 일은 없다.</p>

<h3 style="user-select: auto !important;">입력 형식</h3>

<p style="user-select: auto !important;">셔틀 운행 횟수 <code style="user-select: auto !important;">n</code>, 셔틀 운행 간격 <code style="user-select: auto !important;">t</code>, 한 셔틀에 탈 수 있는 최대 크루 수 <code style="user-select: auto !important;">m</code>, 크루가 대기열에 도착하는 시각을 모은 배열 <code style="user-select: auto !important;">timetable</code>이 입력으로 주어진다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">0 ＜ <code style="user-select: auto !important;">n</code> ≦ 10</li>
<li style="user-select: auto !important;">0 ＜ <code style="user-select: auto !important;">t</code> ≦ 60</li>
<li style="user-select: auto !important;">0 ＜ <code style="user-select: auto !important;">m</code> ≦ 45</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">timetable</code>은 최소 길이 1이고 최대 길이 2000인 배열로, 하루 동안 크루가 대기열에 도착하는 시각이 <code style="user-select: auto !important;">HH:MM</code> 형식으로 이루어져 있다.</li>
<li style="user-select: auto !important;">크루의 도착 시각 <code style="user-select: auto !important;">HH:MM</code>은 <code style="user-select: auto !important;">00:01</code>에서 <code style="user-select: auto !important;">23:59</code> 사이이다.</li>
</ul>

<h3 style="user-select: auto !important;">출력 형식</h3>

<p style="user-select: auto !important;">콘이 무사히 셔틀을 타고 사무실로 갈 수 있는 제일 늦은 도착 시각을 출력한다. 도착 시각은 <code style="user-select: auto !important;">HH:MM</code> 형식이며, <code style="user-select: auto !important;">00:00</code>에서 <code style="user-select: auto !important;">23:59</code> 사이의 값이 될 수 있다.</p>

<h3 style="user-select: auto !important;">입출력 예제</h3>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">t</th>
<th style="user-select: auto !important;">m</th>
<th style="user-select: auto !important;">timetable</th>
<th style="user-select: auto !important;">answer</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">["08:00", "08:01", "08:02", "08:03"]</td>
<td style="user-select: auto !important;">"09:00"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">["09:10", "09:09", "08:00"]</td>
<td style="user-select: auto !important;">"09:09"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">["09:00", "09:00", "09:00", "09:00"]</td>
<td style="user-select: auto !important;">"08:59"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">["00:01", "00:01", "00:01", "00:01", "00:01"]</td>
<td style="user-select: auto !important;">"00:00"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">["23:59"]</td>
<td style="user-select: auto !important;">"09:00"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">60</td>
<td style="user-select: auto !important;">45</td>
<td style="user-select: auto !important;">["23:59","23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"]</td>
<td style="user-select: auto !important;">"18:00"</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;"><a href="http://tech.kakao.com/2017/09/27/kakao-blind-recruitment-round-1/" target="_blank" rel="noopener" style="user-select: auto !important;">해설 보러가기</a></p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
# [level 2] N-Queen - 12952 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12952) 

### 성능 요약

메모리: 82.8 MB, 시간: 108.45 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 08월 25일 10:12:30

### 문제 설명

<p style="user-select: auto !important;">가로, 세로 길이가 n인 정사각형으로된 체스판이 있습니다. 체스판 위의 n개의 퀸이 서로를 공격할 수 없도록 배치하고 싶습니다.</p>

<p style="user-select: auto !important;">예를 들어서 n이 4인경우 다음과 같이 퀸을 배치하면 n개의 퀸은 서로를 한번에 공격 할 수 없습니다.</p>

<p style="user-select: auto !important;"><img src="https://i.imgur.com/lt2zdK6.png" title="" alt="Imgur" style="user-select: auto !important;"><br style="user-select: auto !important;">
<img src="https://i.imgur.com/5c5EUrq.png" title="" alt="Imgur" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">체스판의 가로 세로의 세로의 길이 n이 매개변수로 주어질 때, n개의 퀸이 조건에 만족 하도록 배치할 수 있는 방법의 수를 return하는 solution함수를 완성해주세요.</p>

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">퀸(Queen)은 가로, 세로, 대각선으로 이동할 수 있습니다.</li>
<li style="user-select: auto !important;">n은 12이하의 자연수 입니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">2</td>
</tr>
</tbody>
      </table>
<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1<br style="user-select: auto !important;">
문제의 예시와 같습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
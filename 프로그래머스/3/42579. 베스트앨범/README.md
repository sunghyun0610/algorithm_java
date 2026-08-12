# [level 3] 베스트앨범 - 42579 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42579) 

### 성능 요약

메모리: 73.3 MB, 시간: 1.78 ms

### 구분

코딩테스트 연습 > 해시

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 08월 12일 13:53:01

### 문제 설명

<p style="user-select: auto !important;">스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.</p>

<ol style="user-select: auto !important;">
<li style="user-select: auto !important;">속한 노래가 많이 재생된 장르를 먼저 수록합니다.</li>
<li style="user-select: auto !important;">장르 내에서 많이 재생된 노래를 먼저 수록합니다.</li>
<li style="user-select: auto !important;">장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.</li>
</ol>

<p style="user-select: auto !important;">노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.</p>

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">genres[i]는 고유번호가 i인 노래의 장르입니다.</li>
<li style="user-select: auto !important;">plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.</li>
<li style="user-select: auto !important;">genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.</li>
<li style="user-select: auto !important;">장르 종류는 100개 미만입니다.</li>
<li style="user-select: auto !important;">장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.</li>
<li style="user-select: auto !important;">모든 장르는 재생된 횟수가 다릅니다.</li>
</ul>

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">genres</th>
<th style="user-select: auto !important;">plays</th>
<th style="user-select: auto !important;">return</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">["classic", "pop", "classic", "classic", "pop"]</td>
<td style="user-select: auto !important;">[500, 600, 150, 800, 2500]</td>
<td style="user-select: auto !important;">[4, 1, 3, 0]</td>
</tr>
</tbody>
      </table>
<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">classic 장르는 1,450회 재생되었으며, classic 노래는 다음과 같습니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">고유 번호 3: 800회 재생</li>
<li style="user-select: auto !important;">고유 번호 0: 500회 재생</li>
<li style="user-select: auto !important;">고유 번호 2: 150회 재생</li>
</ul>

<p style="user-select: auto !important;">pop 장르는 3,100회 재생되었으며, pop 노래는 다음과 같습니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">고유 번호 4: 2,500회 재생</li>
<li style="user-select: auto !important;">고유 번호 1: 600회 재생</li>
</ul>

<p style="user-select: auto !important;">따라서 pop 장르의 [4, 1]번 노래를 먼저, classic 장르의 [3, 0]번 노래를 그다음에 수록합니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">장르 별로 가장 많이 재생된 노래를 최대 두 개까지 모아 베스트 앨범을 출시하므로 2번 노래는 수록되지 않습니다.</li>
</ul>

<p style="user-select: auto !important;">※ 공지 - 2019년 2월 28일 테스트케이스가 추가되었습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
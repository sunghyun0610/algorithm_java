# [level 3] 이중우선순위큐 - 42628 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42628) 

### 성능 요약

메모리: 126 MB, 시간: 38.56 ms

### 구분

코딩테스트 연습 > 힙（Heap）

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 07월 28일 14:30:26

### 문제 설명

<p style="user-select: auto !important;">이중 우선순위 큐는 다음 연산을 할 수 있는 자료구조를 말합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">명령어</th>
<th style="user-select: auto !important;">수신 탑(높이)</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">I 숫자</td>
<td style="user-select: auto !important;">큐에 주어진 숫자를 삽입합니다.</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">D 1</td>
<td style="user-select: auto !important;">큐에서 최댓값을 삭제합니다.</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">D -1</td>
<td style="user-select: auto !important;">큐에서 최솟값을 삭제합니다.</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">이중 우선순위 큐가 할 연산 operations가 매개변수로 주어질 때, 모든 연산을 처리한 후 큐가 비어있으면 [0,0] 비어있지 않으면 [최댓값, 최솟값]을 return 하도록 solution 함수를 구현해주세요.</p>

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">operations는 길이가 1 이상 1,000,000 이하인 문자열 배열입니다.</li>
<li style="user-select: auto !important;">operations의 원소는 큐가 수행할 연산을 나타냅니다.

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">원소는 “명령어 데이터” 형식으로 주어집니다.- 최댓값/최솟값을 삭제하는 연산에서 최댓값/최솟값이 둘 이상인 경우, 하나만 삭제합니다.</li>
</ul></li>
<li style="user-select: auto !important;">빈 큐에 데이터를 삭제하라는 연산이 주어질 경우, 해당 연산은 무시합니다.</li>
</ul>

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">operations</th>
<th style="user-select: auto !important;">return</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">["I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"]</td>
<td style="user-select: auto !important;">[0,0]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">["I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"]</td>
<td style="user-select: auto !important;">[333, -45]</td>
</tr>
</tbody>
      </table>
<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">16과 -5643을 삽입합니다.</li>
<li style="user-select: auto !important;">최솟값을 삭제합니다. -5643이 삭제되고 16이 남아있습니다.</li>
<li style="user-select: auto !important;">최댓값을 삭제합니다. 16이 삭제되고 이중 우선순위 큐는 비어있습니다.</li>
<li style="user-select: auto !important;">우선순위 큐가 비어있으므로 최댓값 삭제 연산이 무시됩니다.</li>
<li style="user-select: auto !important;">123을 삽입합니다.</li>
<li style="user-select: auto !important;">최솟값을 삭제합니다. 123이 삭제되고 이중 우선순위 큐는 비어있습니다.</li>
</ul>

<p style="user-select: auto !important;">따라서 [0, 0]을 반환합니다.</p>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">-45와 653을 삽입후 최댓값(653)을 삭제합니다. -45가 남아있습니다.</li>
<li style="user-select: auto !important;">-642, 45, 97을 삽입 후 최댓값(97), 최솟값(-642)을 삭제합니다. -45와 45가 남아있습니다.</li>
<li style="user-select: auto !important;">333을 삽입합니다.</li>
</ul>

<p style="user-select: auto !important;">이중 우선순위 큐에 -45, 45, 333이 남아있으므로, [333, -45]를 반환합니다.</p>

<hr style="user-select: auto !important;">

<p style="user-select: auto !important;">※ 공지 - 2024년 7월 22일 테스트케이스가 추가되었습니다. 기존에 제출한 코드가 통과하지 못할 수도 있습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
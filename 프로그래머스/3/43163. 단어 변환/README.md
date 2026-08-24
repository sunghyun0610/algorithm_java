# [level 3] 단어 변환 - 43163 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/43163) 

### 성능 요약

메모리: 89.2 MB, 시간: 8.14 ms

### 구분

코딩테스트 연습 > 깊이／너비 우선 탐색（DFS／BFS）

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 08월 24일 21:16:23

### 문제 설명

<p style="user-select: auto !important;">두 개의 단어 begin, target과 단어의 집합 words가 있습니다. 아래와 같은 규칙을 이용하여 begin에서 target으로 변환하는 가장 짧은 변환 과정을 찾으려고 합니다.</p>
<div class="highlight" style="user-select: auto !important;"><pre class="codehilite" style="user-select: auto !important;"><code style="user-select: auto !important;">1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
2. words에 있는 단어로만 변환할 수 있습니다.
</code></pre></div>
<p style="user-select: auto !important;">예를 들어 begin이 "hit", target가 "cog", words가 ["hot","dot","dog","lot","log","cog"]라면 "hit" -&gt; "hot" -&gt; "dot" -&gt; "dog" -&gt; "cog"와 같이 4단계를 거쳐 변환할 수 있습니다.</p>

<p style="user-select: auto !important;">두 개의 단어 begin, target과 단어의 집합 words가 매개변수로 주어질 때, 최소 몇 단계의 과정을 거쳐 begin을 target으로 변환할 수 있는지 return 하도록 solution 함수를 작성해주세요.</p>

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">각 단어는 알파벳 소문자로만 이루어져 있습니다.</li>
<li style="user-select: auto !important;">각 단어의 길이는 3 이상 10 이하이며 모든 단어의 길이는 같습니다.</li>
<li style="user-select: auto !important;">words에는 3개 이상 50개 이하의 단어가 있으며 중복되는 단어는 없습니다.</li>
<li style="user-select: auto !important;">begin과 target은 같지 않습니다.</li>
<li style="user-select: auto !important;">변환할 수 없는 경우에는 0를 return 합니다.</li>
</ul>

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">begin</th>
<th style="user-select: auto !important;">target</th>
<th style="user-select: auto !important;">words</th>
<th style="user-select: auto !important;">return</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"hit"</td>
<td style="user-select: auto !important;">"cog"</td>
<td style="user-select: auto !important;">["hot", "dot", "dog", "lot", "log", "cog"]</td>
<td style="user-select: auto !important;">4</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"hit"</td>
<td style="user-select: auto !important;">"cog"</td>
<td style="user-select: auto !important;">["hot", "dot", "dog", "lot", "log"]</td>
<td style="user-select: auto !important;">0</td>
</tr>
</tbody>
      </table>
<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">예제 #1<br style="user-select: auto !important;">
문제에 나온 예와 같습니다.</p>

<p style="user-select: auto !important;">예제 #2<br style="user-select: auto !important;">
target인 "cog"는 words 안에 없기 때문에 변환할 수 없습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
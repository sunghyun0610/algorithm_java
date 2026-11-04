# [level 2] 카펫 - 42842 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42842) 

### 성능 요약

메모리: 77.8 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 완전탐색

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0<br/>정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 11월 04일 13:39:16

### 문제 설명

<p style="user-select: auto !important;">Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.</p>

<p style="user-select: auto !important;"><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/b1ebb809-f333-4df2-bc81-02682900dc2d/carpet.png" title="" alt="carpet.png" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.</p>

<p style="user-select: auto !important;">Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.</p>

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.</li>
<li style="user-select: auto !important;">노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.</li>
<li style="user-select: auto !important;">카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.</li>
</ul>

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">brown</th>
<th style="user-select: auto !important;">yellow</th>
<th style="user-select: auto !important;">return</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">[4, 3]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">8</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">[3, 3]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">24</td>
<td style="user-select: auto !important;">24</td>
<td style="user-select: auto !important;">[8, 6]</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;"><a href="http://hsin.hr/coci/archive/2010_2011/contest4_tasks.pdf" target="_blank" rel="noopener" style="user-select: auto !important;">출처</a></p>

<p style="user-select: auto !important;">※ 공지 - 2020년 2월 3일 테스트케이스가 추가되었습니다.<br style="user-select: auto !important;">
※ 공지 - 2020년 5월 11일 웹접근성을 고려하여 빨간색을 노란색으로 수정하였습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
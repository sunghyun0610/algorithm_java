# [level 2] 올바른 괄호 - 12909 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12909) 

### 성능 요약

메모리: 58 MB, 시간: 8.22 ms

### 구분

코딩테스트 연습 > 스택／큐

### 채점결과

정확성: 69.5<br/>효율성: 30.5<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 11월 04일 19:16:59

### 문제 설명

<p style="user-select: auto !important;">괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"()()" 또는 "(())()" 는 올바른 괄호입니다.</li>
<li style="user-select: auto !important;">")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.</li>
</ul>

<p style="user-select: auto !important;">'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.</p>

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">문자열 s의 길이 : 100,000 이하의 자연수</li>
<li style="user-select: auto !important;">문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">s</th>
<th style="user-select: auto !important;">answer</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"()()"</td>
<td style="user-select: auto !important;">true</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"(())()"</td>
<td style="user-select: auto !important;">true</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">")()("</td>
<td style="user-select: auto !important;">false</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"(()("</td>
<td style="user-select: auto !important;">false</td>
</tr>
</tbody>
      </table>
<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1,2,3,4<br style="user-select: auto !important;">
문제의 예시와 같습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
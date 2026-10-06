# [level 1] 12세 이하인 여자 환자 목록 출력하기 - 132201 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/132201) 

### 성능 요약

메모리: undefined, 시간: 

### 구분

코딩테스트 연습 > SELECT

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2026년 10월 06일 18:30:01

### 문제 설명

<p style="user-select: auto !important;">다음은 종합병원에 등록된 환자정보를 담은 <code style="user-select: auto !important;">PATIENT</code> 테이블입니다. <code style="user-select: auto !important;">PATIENT</code> 테이블은 다음과 같으며 <code style="user-select: auto !important;">PT_NO</code>, <code style="user-select: auto !important;">PT_NAME</code>, <code style="user-select: auto !important;">GEND_CD</code>, <code style="user-select: auto !important;">AGE</code>, <code style="user-select: auto !important;">TLNO</code>는 각각 환자번호, 환자이름, 성별코드, 나이, 전화번호를 의미합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">Column name</th>
<th style="user-select: auto !important;">Type</th>
<th style="user-select: auto !important;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PT_NO</td>
<td style="user-select: auto !important;">VARCHAR(10)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PT_NAME</td>
<td style="user-select: auto !important;">VARCHAR(20)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">GEND_CD</td>
<td style="user-select: auto !important;">VARCHAR(1)</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">AGE</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">TLNO</td>
<td style="user-select: auto !important;">VARCHAR(50)</td>
<td style="user-select: auto !important;">TRUE</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">문제</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">PATIENT</code> 테이블에서 12세 이하인 여자환자의 환자이름, 환자번호, 성별코드, 나이, 전화번호를 조회하는 SQL문을 작성해주세요. 이때 전화번호가 없는 경우, 'NONE'으로 출력시켜 주시고 결과는 나이를 기준으로 내림차순 정렬하고, 나이 같다면 환자이름을 기준으로 오름차순 정렬해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">예시</h5>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">PATIENT</code> 테이블이 다음과 같을 때</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">PT_NO</th>
<th style="user-select: auto !important;">PT_NAME</th>
<th style="user-select: auto !important;">GEND_CD</th>
<th style="user-select: auto !important;">AGE</th>
<th style="user-select: auto !important;">TLNO</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PT22000003</td>
<td style="user-select: auto !important;">브라운</td>
<td style="user-select: auto !important;">M</td>
<td style="user-select: auto !important;">18</td>
<td style="user-select: auto !important;">01031246641</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PT22000004</td>
<td style="user-select: auto !important;">크롱</td>
<td style="user-select: auto !important;">M</td>
<td style="user-select: auto !important;">7</td>
<td style="user-select: auto !important;">NULL</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PT22000006</td>
<td style="user-select: auto !important;">뽀뽀</td>
<td style="user-select: auto !important;">W</td>
<td style="user-select: auto !important;">8</td>
<td style="user-select: auto !important;">NULL</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PT22000009</td>
<td style="user-select: auto !important;">한나</td>
<td style="user-select: auto !important;">W</td>
<td style="user-select: auto !important;">12</td>
<td style="user-select: auto !important;">01032323117</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PT22000012</td>
<td style="user-select: auto !important;">뿡뿡이</td>
<td style="user-select: auto !important;">M</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">NULL</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PT22000013</td>
<td style="user-select: auto !important;">크리스</td>
<td style="user-select: auto !important;">M</td>
<td style="user-select: auto !important;">30</td>
<td style="user-select: auto !important;">01059341192</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PT22000014</td>
<td style="user-select: auto !important;">토프</td>
<td style="user-select: auto !important;">W</td>
<td style="user-select: auto !important;">22</td>
<td style="user-select: auto !important;">01039458213</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PT22000018</td>
<td style="user-select: auto !important;">안나</td>
<td style="user-select: auto !important;">W</td>
<td style="user-select: auto !important;">11</td>
<td style="user-select: auto !important;">NULL</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PT22000019</td>
<td style="user-select: auto !important;">바라</td>
<td style="user-select: auto !important;">W</td>
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">01079068799</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PT22000021</td>
<td style="user-select: auto !important;">릴로</td>
<td style="user-select: auto !important;">W</td>
<td style="user-select: auto !important;">33</td>
<td style="user-select: auto !important;">01023290767</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">SQL을 실행하면 다음과 같이 출력되어야 합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">PT_NAME</th>
<th style="user-select: auto !important;">PT_NO</th>
<th style="user-select: auto !important;">GEND_CD</th>
<th style="user-select: auto !important;">AGE</th>
<th style="user-select: auto !important;">TLNO</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">한나</td>
<td style="user-select: auto !important;">PT22000009</td>
<td style="user-select: auto !important;">W</td>
<td style="user-select: auto !important;">12</td>
<td style="user-select: auto !important;">01032323117</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">안나</td>
<td style="user-select: auto !important;">PT22000018</td>
<td style="user-select: auto !important;">W</td>
<td style="user-select: auto !important;">11</td>
<td style="user-select: auto !important;">NONE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">바라</td>
<td style="user-select: auto !important;">PT22000019</td>
<td style="user-select: auto !important;">W</td>
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">01079068799</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">뽀뽀</td>
<td style="user-select: auto !important;">PT22000006</td>
<td style="user-select: auto !important;">W</td>
<td style="user-select: auto !important;">8</td>
<td style="user-select: auto !important;">NONE</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
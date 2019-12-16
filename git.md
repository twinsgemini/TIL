# Git 기초

## 0. 준비 사항

* [git bash](https://gitforwindows.org/)
  * git을 활용하기 위한 CLI(Command Line Interface) 를 제공한다.
  * source tree, github desktop 등을 통해 GUI 환경에서도 활용 가능하다.

## 1. 로컬 저장소 활용하기

### 1. 저장소 초기화

```bash
$ git init

Initialized empty Git repository in C:/Users/student/Desktop/TIL/.git/
(master) $
```


* 저장소(repository)를 초기화 하게 되면, `.git` 폴더가 해당 디렉토리에 생성된다.
* bash 창에서는 (master) 라고 표기된다.

  * 현재 브랜치가 master라는 것을 의미함.

## 2. add - staging area


### 상황 1. fast-foward

> fast-foward는 feature 브랜치 생성된 이후 master 브랜치에 변경 사항이 없는 상황

1. feature/test branch 생성 및 이동

   ```bash
   $ git checkout -b feature/test
   Switched to a new branch 'feature/test'
   ```

   

2. 작업 완료 후 commit

   ```bash
   $ touch test.txt
   $ git add test.txt
   $ git commit -m 'Complete test'
   [feature/test 490a7b6] Complete test
    1 file changed, 0 insertions(+), 0 deletions(-)
    create mode 100644 test.txt
   ```

   

3. master 이동

   ```bash
   (feature/test) $ git checkout master
   Switched to branch 'master'
   (master) $
   ```

   

4. master에 병합

   ```bash
   (master) $ git merge feature/test
   ```

   

5. 결과 -> fast-foward (단순히 HEAD를 이동)

   ```bash
   Updating 0b5fcb8..490a7b6
   Fast-forward
    test.txt | 0
    1 file changed, 0 insertions(+), 0 deletions(-)
    create mode 100644 test.txt
   
   ```

   

6. branch 삭제

   ```bash
   $ git branch -d feature/test
   Deleted branch feature/test (was 490a7b6).
   ```

   

------

### 상황 2. merge commit

> 서로 다른 이력(commit)을 병합(merge)하는 과정에서 다른 파일이 수정되어 있는 상황
>
> git이 auto merging을 진행하고, commit이 발생된다.

1. feature/signout branch 생성 및 이동

   ```bash
   # $ git branch feature/signout # 생성
   # $ git checkout feature/signout # 이동
   $ git checkout -d feature/signout # 생성 및 이동
   ```

   

   

2. 작업 완료 후 commit

   ```bash
   $ touch signout.html
   $ git add .
   $ git commit -m 'Complete signout'
   $ git log --oneline
   656f38c (HEAD -> feature/signout) Complete signout
   490a7b6 (master) Complete test
   0b5fcb8 Complete index page
   cd89ad2 Add README
   
   ```

   

3. master 이동

   ```bash
   $ git checkout master
   $ git log --oneline
   $ git log --oneline
   490a7b6 (HEAD -> master) Complete test
   0b5fcb8 Complete index page
   cd89ad2 Add README
   
   ```

   

4. *master에 추가 commit 이 발생시키기!!*

   - **다른 파일을 수정 혹은 생성하세요!**

   ```bash
   $ touch hotfix.txt
   $ git add .
   $ git commit -m 'Hotfix on master'
   ```

   ```bash
   $git log --oneline
   62ea0fc (HEAD -> master) Hotfix on master
   490a7b6 Complete test
   0b5fcb8 Complete index page
   cd89ad2 Add README
   ```

   

5. master에 병합

   ```bash
   (master) $ git merge feature/signout
   ```

   

6. 결과 -> 자동으로 *merge commit 발생*

   - vim 편집기 화면이 나타납니다.
   - 자동으로 작성된 커밋 메시지를 확인하고, `esc`를 누른 후 `:wq`를 입력하여 저장 및 종료를 합니다.
     - `w` : write
     - `q` : quit
   - 커밋이 확인 해봅시다.

7. 그래프 확인하기

   ```bash
   $ git log --oneline --graph
   *   34f2be9 (HEAD -> master) Merge branch 'feature/signout'
   |\
   | * 656f38c (feature/signout) Complete signout
   * | 62ea0fc Hotfix on master
   |/
   * 490a7b6 Complete test
   * 0b5fcb8 Complete index page
   * cd89ad2 Add README
   ```

   

8. branch 삭제

------

### 상황 3. merge commit 충돌

> 서로 다른 이력(commit)을 병합(merge)하는 과정에서 동일 파일이 수정되어 있는 상황
>
> git이 auto merging을 하지 못하고, 해당 파일의 위치에 라벨링을 해준다.
>
> 원하는 형태의 코드로 직접 수정을 하고 merge commit을 발생 시켜야 한다.

1. feature/board branch 생성 및 이동

   ```bash
   $ git checkout -b feature/board
   ```

   

2. 작업 완료 후 commit

   ```bash
   $ touch board.html
   # README.md 수정
   $ git add .
   $ git commit -m 'Complete board & Update README'
   $ git log --oneline
   8115326 (HEAD -> feature/board) Complete board & Update README
   34f2be9 (master) Merge branch 'feature/signout'
   62ea0fc Hotfix on master
   656f38c Complete signout
   490a7b6 Complete test
   0b5fcb8 Complete index page
   cd89ad2 Add README
   ```

   

3. master 이동

   ```bash
   $ git checkout master
   ```

   

4. *master에 추가 commit 이 발생시키기!!*

   - **동일 파일을 수정 혹은 생성하세요!**

   ```bash
   $ git add .
   $ git commit 'Update README on master'
   $ git log --oneline
   d3427a8 (HEAD -> master) Update README on master
   34f2be9 Merge branch 'feature/signout'
   62ea0fc Hotfix on master
   656f38c Complete signout
   490a7b6 Complete test
   0b5fcb8 Complete index page
   cd89ad2 Add README
   ```

   

5. master에 병합

   ```bash
   $ git merge feature/board
   Auto-merging README.md
   CONFLICT (content): Merge conflict in README.md
   Automatic merge failed; fix conflicts and then commit the result.
   (master|MERGING) $ git status
   On branch master
   You have unmerged paths.
     (fix conflicts and run "git commit")
     (use "git merge --abort" to abort the merge)
   
   Changes to be committed:
           new file:   board.html
   
   Unmerged paths:
     (use "git add <file>..." to mark resolution)
           both modified:   README.md
   ```

6. 결과 -> *merge conflict발생*

7. 충돌 확인 및 해결

```bash
<<<<<<< HEAD
master에서 추가 함!

=======
게시판 기능 구현 완료.
>>>>>>> feature/board
```

* HEAD(현재 상황), 아래에 feature/board 변화 내역들이 각각 표기 되어 있다.
* 원하는 형태로 코드를 수정한다.

8. merge commit 진행

   ```bash
   $ git commit
   ```
   - vim 편집기 화면이 나타납니다.
   - 자동으로 작성된 커밋 메시지를 확인하고, `esc`를 누른 후 `:wq`를 입력하여 저장 및 종료를 합니다.
     - `w` : write
     - `q` : quit
   - 커밋이 확인 해봅시다.

9. 그래프 확인하기

   ```bash
   $ git log --oneline --graph
   *   37ec73f (HEAD -> master) Merge branch 'feature/board'
   |\
   | * 8115326 (feature/board) Complete board & Update README
   * | d3427a8 Update README on master
   |/
   *   34f2be9 Merge branch 'feature/signout'
   |\
   | * 656f38c Complete signout
   * | 62ea0fc Hotfix on master
   |/
   * 490a7b6 Complete test
   * 0b5fcb8 Complete index page
   * cd89ad2 Add README
   ```

   

10. branch 삭제

    ```bash
    $ git branch -d feature/board
    Deleted branch feature/board (was 8115326).
```
    
    
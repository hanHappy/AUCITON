<script setup>
</script>

<template>

    <main>

        <form action="" enctype="multipart/from-data">
            <div class="imgButton">
                <div>
                    <label for="choosefile">
                        CLICK HERE!
                    </label>
                </div>
            <input type="file" id="chooseFile" name="chooseFile" accept="image/*" onchange="loadFile(this) ">
            </div>
        </form>

        <input class="title" type="text" placeholder="제목을 입력해주세요">
        <!-- <h1>제목을 입력해주세요</h1> -->
        
        <br>
        <select name="category">
            <option value="" selected> -- 선택 --</option>
            <option value="의류">의류</option>
            <option value="신발">신발</option>
            <option value="가전제품">가전제품</option>
            <option value="전자기기">전자기기</option>
            <option value="기타">기타</option>
        </select>
        <br>
        <input class="subTitle" type="text" placeholder="경매품명을 입력해주세요">

        <div class="regbox">
            입찰 설정
        </div>

        <button class="regButton">

        </button>

    </main>

</template>

<!-- Registration.vue만의 스타일 -->
<style scoped>

.imgButton{
    width: 150px;
    height: 150px;
    background-color: blanchedalmond;
    border-radius: 10px;
    
}

.labal {
    cursor: pointer;
    font-size: 1em;
}

#chooseFile {
    /* visibility: hidden; */
}

.title{
    border: none;
    background: transparent;
    font-size:  2em;
    color: rgb(104, 102, 100);
}

.subTitle{
    border: none;
    background: transparent;
    font-size:  0.5em;
    color: rgb(104, 102, 100);
}

.regbox{
    width: 300px;
    height: 50px;
    background-color: rgb(228, 62, 81);
    color: white;
    border-radius: 10px;
}

</style>
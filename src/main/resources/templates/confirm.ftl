<#import "_wrapper.ftl" as wrapper>
<@wrapper.main title = "お問い合わせ確認">
<div class="container">
    <Form action="/save" method="post">
        <div class="form-group row">
            <label for="name" class="col-xs-offset-3 col-xs-2 col-form-label">名前</label>
            <div class="col-xs-4">
                <p class="">${inquiryForm.name}</p>
            </div>
        </div>
        <div class="form-group row">
            <label for="email" class="col-xs-offset-3 col-xs-2 col-form-label">メールアドレス</label>
            <div class="col-xs-4">
                <p class="">${inquiryForm.email}</p>
            </div>
        </div>
        <div class="form-group row">
            <label for="content" class="col-xs-offset-3 col-xs-2 col-form-label">内容</label>
            <div class="col-xs-4">
                <p class="">${inquiryForm.content?replace('\n', '<br/>')}</p>
            </div>
        </div>
        <div class="col-xs-offset-4">
            <input type="hidden" name="name" value="${inquiryForm.name}">
            <input type="hidden" name="email" value="${inquiryForm.email}">
            <input type="hidden" name="content" value="${inquiryForm.content}">
            <button type="submit" class="btn btn-primary" name="save">送信</button>
            <button type="submit" class="btn btn-primary" name="back">戻る</button>
        </div>
    </Form>
</div>
</@wrapper.main>
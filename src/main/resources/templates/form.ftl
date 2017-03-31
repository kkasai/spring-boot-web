<#import "_wrapper.ftl" as wrapper>
<@wrapper.main title = "お問い合わせフォーム">
<div class="container">
    <Form action="/confirm" method="post">
        <div class="form-group row">
            <label for="name" class="col-xs-offset-3 col-xs-2 col-form-label">名前</label>
            <div class="col-xs-4">
                <input type="text" id="name" name="name" class="form-control" value="${inquiryForm.name!}">
            </div>
        </div>
        <div class="form-group row">
            <label for="email" class="col-xs-offset-3 col-xs-2 col-form-label">メールアドレス</label>
            <div class="col-xs-4">
                <input type="email" id="email" name="email" class="form-control" value="${inquiryForm.email!}">
            </div>
        </div>
        <div class="form-group row">
            <label for="content" class="col-xs-offset-3 col-xs-2 col-form-label">内容</label>
            <div class="col-xs-4">
                <textarea id="content" name="content" class="form-control" rows="3">${inquiryForm.content!}</textarea>
            </div>
        </div>
        <div class="col-xs-offset-5 col-xs-7">
            <button type="submit" class="btn btn-primary">送信</button>
        </div>
    </Form>
</div>
</@wrapper.main>
<!DOCTYPE html>
<html>
<header>
    <meta charset="utf-8"/>
    <title>index</title>
    <link rel="stylesheet" type="text/css" href="http://unpkg.com/iview/dist/styles/iview.css">
    <script type="text/javascript" src="http://vuejs.org/js/vue.min.js"></script>
    <script type="text/javascript" src="http://unpkg.com/iview/dist/iview.min.js"></script>
</header>
<body>
<div id="app">
    <i-button @click="show">Click me!</i-button>
    <Modal v-model="visible" title="Welcome">Welcome to iView</Modal>
</div>
<div id="app1">


<Row>
    <i-col span="12">col-12</i-col>
    <i-col span="12">col-12</i-col>
</Row>
<br>
<Row>
    <i-col span="8">col-8</i-col>
    <i-col span="8">col-8</i-col>
    <i-col span="8">col-8</i-col>
</Row>
<br>
<Row>
    <i-col span="6">col-6</i-col>
    <i-col span="6">col-6</i-col>
    <i-col span="6">col-6</i-col>
    <i-col span="6">col-6</i-col>
</Row>
</div>
<script>
    new Vue({
        el: '#app',
        data: {
            visible: false
        },
        methods: {
            show: function () {
                this.visible = true;
            }
        }
    })
    var Main = {
        el:'#app1'
    }
    var Component = Vue.extend(Main)
    new Component().$mount('#app')
</script>
</body>
</html>
new Vue({

    el:"#app",
    methods:{

        axios:function (event) {

            axios({

               method:"post",
               url:event.target.href,
               params:{

                   username:"JuJingyi",
                   password:"123456"

               }

            }).then(function (response) {

                alert(response.data);

            });
            event.preventDefault();

        }

    }

});
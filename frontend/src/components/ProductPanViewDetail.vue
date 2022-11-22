<template>

    <v-card outlined>
        <v-card-title>
            ProductPan # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="Product" v-model="item.product" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="State" v-model="item.state" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'ProductPanViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/productPans/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>


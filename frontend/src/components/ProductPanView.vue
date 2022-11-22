<template>

    <v-data-table
        :headers="headers"
        :items="productPan"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ProductPanView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "product", value: "product" },
                { text: "state", value: "state" },
            ],
            productPan : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/productPans'))

            temp.data._embedded.productPans.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.productPan = temp.data._embedded.productPans;
        },
        methods: {
        }
    }
</script>


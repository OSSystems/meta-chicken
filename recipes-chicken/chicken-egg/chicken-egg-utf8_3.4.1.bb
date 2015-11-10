SECTION = "devel/chicken"
DESCRIPTION = "Unicode support"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://utf8.meta;md5=d16c7c5bafcd2bf93020267fc4bc124c"
DEPENDS_append_class-cross = " chicken-egg-iset-cross chicken-egg-regex-cross chicken-egg-make-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-iset-crosssdk chicken-egg-regex-crosssdk chicken-egg-make-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-iset nativesdk-chicken-egg-regex nativesdk-chicken-egg-make chicken-egg-iset-crosssdk chicken-egg-regex-crosssdk chicken-egg-make-crosssdk"
DEPENDS = " chicken-egg-iset chicken-egg-regex chicken-egg-make chicken-egg-iset-cross chicken-egg-regex-cross chicken-egg-make-cross chicken-egg-utf8-cross"
RDEPENDS_${PN} = " chicken-egg-iset chicken-egg-regex chicken-egg-make"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/utf8/utf8-${PV}.tar.gz"

SRC_URI[md5sum] = "e87be1d9686a59336d8a39f498403a58"
SRC_URI[sha256sum] = "0b2c349931c34addaf7aa243ab7ab7fc0d2313fbc3016f541c902a818ddb9a06"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

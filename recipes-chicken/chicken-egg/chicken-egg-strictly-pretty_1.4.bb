SECTION = "devel/chicken"
DESCRIPTION = "Algebraic pretty printer."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://strictly-pretty.meta;md5=44591c13ff904849ac115468226c706e"
DEPENDS_append_class-cross = " chicken-egg-datatype-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-datatype-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-datatype nativesdk-chicken-egg-matchable chicken-egg-datatype-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-datatype chicken-egg-matchable chicken-egg-datatype-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-datatype chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/strictly-pretty/strictly-pretty-${PV}.tar.gz"

SRC_URI[md5sum] = "8615adf2c05f1ff6c5bccee7147a682a"
SRC_URI[sha256sum] = "c715a093c66f4376983b01f4135265b10898fb67bc0865ef667437776fb7c325"

S = "${WORKDIR}/strictly-pretty-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

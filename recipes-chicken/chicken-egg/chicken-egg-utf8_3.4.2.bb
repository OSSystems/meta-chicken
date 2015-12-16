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

SRC_URI[md5sum] = "e797b330608c84e7e1621f4e01e4a8cb"
SRC_URI[sha256sum] = "4a84574914977f74510b4ff25460ead7857d20991011b3dd215490ccfca50c33"

S = "${WORKDIR}/utf8-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

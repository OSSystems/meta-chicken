SECTION = "devel/chicken"
DESCRIPTION = "Design by contract for procedures"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://simple-contracts.meta;md5=3d8d29b106d9ce5b47d0cb3e1b9bbc6e"
DEPENDS_append_class-cross = " chicken-egg-simple-exceptions-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-simple-exceptions-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-simple-exceptions chicken-egg-simple-exceptions-crosssdk"
DEPENDS = " chicken-egg-simple-exceptions chicken-egg-simple-exceptions-cross"
RDEPENDS_${PN} = " chicken-egg-simple-exceptions"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-contracts/simple-contracts-${PV}.tar.gz"

SRC_URI[md5sum] = "95f4440fcec5c4f1fa0cae9f62df40d1"
SRC_URI[sha256sum] = "e19d23915d522553be26643cccac09e633d8e1c2ab46ca5b03b0b639a6aadfff"

S = "${WORKDIR}/simple-contracts-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

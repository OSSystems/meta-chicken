SECTION = "devel/chicken"
DESCRIPTION = "Simple dispatch based on the supplied uri"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://uri-dispatch.meta;md5=7593bf2f4517193ca30cb6b9e5bf56c7"
DEPENDS_append_class-cross = " chicken-egg-uri-common-cross chicken-egg-environments-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-uri-common-crosssdk chicken-egg-environments-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-environments chicken-egg-uri-common-crosssdk chicken-egg-environments-crosssdk"
DEPENDS = " chicken-egg-uri-common chicken-egg-environments chicken-egg-uri-common-cross chicken-egg-environments-cross"
RDEPENDS_${PN} = " chicken-egg-uri-common chicken-egg-environments"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/uri-dispatch/uri-dispatch-${PV}.tar.gz"

SRC_URI[md5sum] = "3030369da69b6d7b50b5c176a5ec6860"
SRC_URI[sha256sum] = "51fa27866a8096571de6165dee0ccbf1afc6c2f5612068ad2d0438fd4e97fd67"

S = "${WORKDIR}/uri-dispatch-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

SECTION = "devel/chicken"
DESCRIPTION = "Cross-platform file path manipulation."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://filepath.meta;md5=bde7c6bdd04a281b5f8b7d07a90448ab"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/filepath/filepath-${PV}.tar.gz"

SRC_URI[md5sum] = "e54fc3cb30286242d52001822e85a098"
SRC_URI[sha256sum] = "f4e561729c91678d4dfa247d5712007f8640f82c8fc3ae934edda7aac86e9069"

S = "${WORKDIR}/filepath-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

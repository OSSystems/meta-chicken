SECTION = "devel/chicken"
DESCRIPTION = "Type system extensions"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://type-extensions.meta;md5=b347ec1409f076839427673db29572ef"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/type-extensions/type-extensions-${PV}.tar.gz"

SRC_URI[md5sum] = "c678d5739af6967db81e23e952886b63"
SRC_URI[sha256sum] = "9f0c8d74b053346c059458c9bb0ecb0536bdbc975d379ff679060f4761da89f5"

S = "${WORKDIR}/type-extensions-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

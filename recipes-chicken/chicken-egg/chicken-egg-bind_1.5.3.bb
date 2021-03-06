SECTION = "devel/chicken"
DESCRIPTION = "Automatically generate bindings from C/C++ declarations"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://bind.meta;md5=3754eeb985e31433f3918def7fef59ea"
DEPENDS_append_class-cross = " chicken-egg-silex-cross chicken-egg-matchable-cross chicken-egg-coops-cross chicken-egg-regex-cross chicken-egg-make-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-silex-crosssdk chicken-egg-matchable-crosssdk chicken-egg-coops-crosssdk chicken-egg-regex-crosssdk chicken-egg-make-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-silex nativesdk-chicken-egg-matchable nativesdk-chicken-egg-coops nativesdk-chicken-egg-regex nativesdk-chicken-egg-make chicken-egg-silex-crosssdk chicken-egg-matchable-crosssdk chicken-egg-coops-crosssdk chicken-egg-regex-crosssdk chicken-egg-make-crosssdk"
DEPENDS = " chicken-egg-silex chicken-egg-matchable chicken-egg-coops chicken-egg-regex chicken-egg-make chicken-egg-silex-cross chicken-egg-matchable-cross chicken-egg-coops-cross chicken-egg-regex-cross chicken-egg-make-cross chicken-egg-bind-cross"
RDEPENDS_${PN} = " chicken-egg-silex chicken-egg-matchable chicken-egg-coops chicken-egg-regex chicken-egg-make"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/bind/bind-${PV}.tar.gz"

SRC_URI[md5sum] = "03aa6612822aeaf67beac61633a2aa0d"
SRC_URI[sha256sum] = "44351bbab5e9419d5519e47e2371fd4e82b0b794e312b5841b6b7886f7a4d2e6"

S = "${WORKDIR}/bind-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

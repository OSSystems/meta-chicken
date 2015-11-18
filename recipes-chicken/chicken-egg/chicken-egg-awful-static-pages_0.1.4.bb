SECTION = "devel/chicken"
DESCRIPTION = "Tool to generate static pages out of awful applications"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful-static-pages.meta;md5=4c44f614d908794c421a5b43af454943"
DEPENDS_append_class-cross = " chicken-egg-awful-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-awful-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-awful chicken-egg-awful-crosssdk"
DEPENDS = " chicken-egg-awful chicken-egg-awful-cross chicken-egg-awful-static-pages-cross"
RDEPENDS_${PN} = " chicken-egg-awful"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/awful-static-pages/awful-static-pages-${PV}.tar.gz"

SRC_URI[md5sum] = "0892dadf77976ec9227454ab7c2585b2"
SRC_URI[sha256sum] = "9a25a1a8f2eda8832d9ac453c921bef225de8a189bf4d066c51656e07b8989e6"

S = "${WORKDIR}/awful-static-pages-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
